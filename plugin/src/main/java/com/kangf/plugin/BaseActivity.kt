package com.kangf.plugin

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 获取自己创建的resources
        val resources = LoadUtils.getResources(application)
        // 创建自己的Context
        mContext = ContextThemeWrapper(baseContext, 0)
        // 把自己的Context中的resources替换为我们自己的
        val clazz = mContext::class.java
        val mResourcesField = clazz.getDeclaredField("mResources")
        mResourcesField.isAccessible = true
        mResourcesField.set(mContext, resources)


    }

//    override fun getResources(): Resources {
//        if (application != null && application.resources != null)
//            return application.resources
//        return super.getResources()
//    }
}