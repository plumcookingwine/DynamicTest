package com.kangf.dynamic

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.morgoo.droidplugin.pm.PluginManager
import com.morgoo.helper.Log
import kotlinx.android.synthetic.main.activity_droid_plugin.*

class DroidPluginActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_droid_plugin)

        mBtnInstall.setOnClickListener {
            val flag = PluginManager.getInstance().installPackage("sdcard/plugin-debug.apk", 0)
            if (1 == flag) {
                Toast.makeText(this, "安装完成", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "安装失败,请先卸载插件", Toast.LENGTH_LONG).show()
            }
        }

        mBtnStart.setOnClickListener {
            /**
             * FUCK DROID PLUGIN ,一运行就崩溃！
             */
            val pm = packageManager
            val intent = pm.getLaunchIntentForPackage("com.kangf.plugin")
            if (intent != null) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                Log.i("DroidPlugin", "start com.kangf.plugin@$intent")
                startActivity(intent)
            } else {
                Log.e("DroidPlugin", "pm $pm no find intent ")
            }

        }

        mBtnUnInstall.setOnClickListener {
            PluginManager.getInstance().deletePackage("com.kangf.plugin", 0)
            Toast.makeText(this, "卸载完成", Toast.LENGTH_LONG).show()
        }

    }

}
