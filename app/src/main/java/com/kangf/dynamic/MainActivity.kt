package com.kangf.dynamic

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import dalvik.system.PathClassLoader
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
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
            LoadUtils.load(this)
            Toast.makeText(this, "加载apk完成，现在可以调用apk中的类了", Toast.LENGTH_LONG).show()
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
            val clazz = Class.forName("com.kangf.plugin.Test")
            val method = clazz.getMethod("test", Context::class.java)
            method.invoke(clazz.newInstance(), this)
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "请先点击加载apk", Toast.LENGTH_LONG).show()
        }

    }
}
