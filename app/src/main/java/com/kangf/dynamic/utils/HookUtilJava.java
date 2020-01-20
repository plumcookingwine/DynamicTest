package com.kangf.dynamic.utils;

import android.content.Intent;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import com.morgoo.helper.compat.ActivityThreadCompat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

/**
 * 这里没有适配 API 29 android 10 系统
 */
public class HookUtilJava {

    public static void hookAms() {


        try {
            Object singleTon = null;
            /*
             * android 26或以上版本的API是一样的
             */
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                Class<?> activityManagerClass = Class.forName("android.app.ActivityManager");
                Field iActivityManagerSingletonField = activityManagerClass.getDeclaredField("IActivityManagerSingleton");
                iActivityManagerSingletonField.setAccessible(true);
                singleTon = iActivityManagerSingletonField.get(null);
            } else {
                /*
                 *  android 26或以下版本的API是一个系列
                 */
                Class<?> activityManagerClass = Class.forName("android.app.ActivityManagerNative");
                Field iActivityManagerSingletonField = activityManagerClass.getDeclaredField("gDefault");
                iActivityManagerSingletonField.setAccessible(true);
                singleTon = iActivityManagerSingletonField.get(null);
            }


            Class<?> singleTonClass = Class.forName("android.util.Singleton");
            Field mInstanceField = singleTonClass.getDeclaredField("mInstance");
            mInstanceField.setAccessible(true);

            // 获取到IActivityManagerSingleton的对象
            final Object mInstance = mInstanceField.get(singleTon);


            Class<?> iActivityManagerClass = Class.forName("android.app.IActivityManager");

            Object newInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                    new Class[]{iActivityManagerClass},
                    new InvocationHandler() {

                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                            if (method.getName().equals("startActivity")) {

                                int index = 0;

                                for (int i = 0; i < args.length; i++) {
                                    if (args[i] instanceof Intent) {
                                        index = i;
                                        break;
                                    }
                                }

                                Intent proxyIntent = new Intent();
                                proxyIntent.setClassName("com.kangf.dynamic",
                                        "com.kangf.dynamic.ProxyActivity");
                                proxyIntent.putExtra("oldIntent", (Intent) args[index]);
                                args[index] = proxyIntent;
                            }
                            return method.invoke(mInstance, args);
                        }
                    });

            mInstanceField.set(singleTon, newInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void hookHandler() {

        try {
            // 获取ActivityThread实例
            final Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
            Field activityThreadField = activityThreadClass.getDeclaredField("sCurrentActivityThread");
            activityThreadField.setAccessible(true);
            final Object activityThread = activityThreadField.get(null);

            // 获取Handler实例
            Field mHField = activityThreadClass.getDeclaredField("mH");
            mHField.setAccessible(true);
            Object mH = mHField.get(activityThread);


            Class<?> handlerClass = Class.forName("android.os.Handler");
            Field mCallbackField = handlerClass.getDeclaredField("mCallback");
            mCallbackField.setAccessible(true);
            mCallbackField.set(mH, new Handler.Callback() {

                @Override
                public boolean handleMessage(Message msg) {

                    Log.e("kangf", "handling code = " + msg.what);

                    switch (msg.what) {
                        case 100: // API 28 以前直接接收
                            try {
                                // 获取ActivityClientRecord中的intent对象
                                Field intentField = msg.obj.getClass().getDeclaredField("intent");
                                intentField.setAccessible(true);
                                Intent proxyIntent = (Intent) intentField.get(msg.obj);

                                // 拿到插件的Intent
                                Intent intent = proxyIntent.getParcelableExtra("oldIntent");

                                // 替换回来
                                proxyIntent.setComponent(intent.getComponent());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;

                        case 159: // API 28 以后加入了 lifecycle， 这里msg发生了变化
                            try {
                                Field mActivityCallbacksField = msg.obj.getClass().getDeclaredField("mActivityCallbacks");
                                mActivityCallbacksField.setAccessible(true);
                                List<Object> mActivityCallbacks = (List<Object>) mActivityCallbacksField.get(msg.obj);
                                for (int i = 0; i < mActivityCallbacks.size(); i++) {
                                    Class<?> itemClass = mActivityCallbacks.get(i).getClass();
                                    if (itemClass.getName().equals("android.app.servertransaction.LaunchActivityItem")) {
                                        Field intentField = itemClass.getDeclaredField("mIntent");
                                        intentField.setAccessible(true);
                                        Intent proxyIntent = (Intent) intentField.get(mActivityCallbacks.get(i));
                                        Intent intent = proxyIntent.getParcelableExtra("oldIntent");
                                        proxyIntent.setComponent(intent.getComponent());
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                    }

                    // 这里必须返回false
                    return false;

                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
