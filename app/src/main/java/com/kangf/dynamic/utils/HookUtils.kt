package com.kangf.dynamic.utils

import android.content.Intent
import android.text.TextUtils
import com.morgoo.helper.Log
import java.lang.Exception
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

object HookUtils {


    /**
     * 用于hook  ActivityManagerService
     */
    fun hookAMS() {

        try {

            val startTime = System.currentTimeMillis()

            val activityManagerClass = Class.forName("android.app.ActivityManager")


            Log.i("kangf", "耗时 kt：：： " + (System.currentTimeMillis() - startTime))

            activityManagerClass.declaredFields.forEach {
                it.isAccessible = true
                Log.e("kangf", "field  == " + it.name)
            }
            val singletonField = activityManagerClass.getDeclaredField("IActivityManagerSingleton")
            singletonField.isAccessible = true
            val singleton = singletonField.get(null)

            val singletonClass = Class.forName("android.util.Singleton")
            val mInstanceField = singletonClass.getDeclaredField("mInstance")
            mInstanceField.isAccessible = true

            val mInstance = mInstanceField.get(singleton)


            val iActivityManagerClass = Class.forName("android.app.IActivityManager")

            /**
             * iActivityManagerClass方法执行，都会走到回调
             */
            val proxyObj = Proxy.newProxyInstance(
                Thread.currentThread().contextClassLoader,
                arrayOf(iActivityManagerClass),
                object : InvocationHandler {
                    override fun invoke(proxy: Any?, method: Method, args: Array<in Any>): Any {

                        Log.e("kangf", "old args === ${args.size}")


                        if (TextUtils.equals("startActivity", method.name)) {
                            var index = 0
                            kotlin.run outside@{
                                args.forEachIndexed { ind, any ->
                                    if (any is Intent) {
                                        index = ind
                                        return@outside
                                    }
                                }
                            }

                            Log.e("kangf", "index == $index")

                            // 创建一个新的intent
                            val proxyIntent = Intent()
                            proxyIntent.setClassName(
                                "com.kangf.dynamic",
                                "com.kangf.dynamic.ProxyActivity"
                            )
                            // 保存原来的intent参数
                            proxyIntent.putExtra("oldIntent", args[index] as Intent)
                            // 改变原来的参数，就成了跳转到代理activity了，6不6

                            args[index] = proxyIntent
                        }

                        // 执行原来的方法
                        Log.e("kangf", "change args === ${args.size}")
                        return method.invoke(mInstance, *args)
                    }

                }
            )

            mInstanceField.set(singleton, proxyObj)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

}
