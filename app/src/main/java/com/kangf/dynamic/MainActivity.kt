package com.kangf.dynamic

import android.Manifest
import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.kangf.dynamic.utils.HookUtilJava
import com.kangf.dynamic.utils.LoadUtils
import dalvik.system.PathClassLoader
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : Activity() {

    private var isLoad = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arr = arrayOf(
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE
        )

        ActivityCompat.requestPermissions(this, arr, 10)

        mTest.setOnClickListener {
            startActivity(Intent(this, DroidPluginActivity::class.java))
        }

        mBtnUseDex.setOnClickListener {
            loadDex()
        }

        mBtnLoadApk.setOnClickListener {
            if (!isLoad) {
                LoadUtils.load(this)
//            HookUtils.hookAMS()
                HookUtilJava.hookAms()
                HookUtilJava.hookHandler()
                Toast.makeText(this, "加载apk完成", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "已经加载过了，请直接启动apk", Toast.LENGTH_LONG).show()
            }

        }

        mBtnUseApk.setOnClickListener {
            loadApk()
        }


    }

    /**
     * 直接加载dex文件
     */
    private fun loadDex() {

        try {
            val classLoader = PathClassLoader("sdcard/plugin.dex", classLoader)
            val clazz = classLoader.loadClass("com.kangf.plugin.Test")
            val method = clazz.getMethod("test", Context::class.java)
            method.invoke(clazz.newInstance(), this)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    /**
     * 加载外部apk中的class
     */
    private fun loadApk() {
        try {
            // 调用插件类
            val clazz = Class.forName("com.kangf.plugin.Test")
            val method = clazz.getMethod("test", Context::class.java)
            method.invoke(clazz.newInstance(), this)

            // 跳转插件 Activity
            val intent = Intent()
            intent.component = ComponentName("com.kangf.plugin", "com.kangf.plugin.MainActivity")
            startActivity(intent)


        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "请先点击加载apk", Toast.LENGTH_LONG).show()
        }

    }
}
