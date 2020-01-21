package com.kangf.plugin

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val view = LayoutInflater.from(mContext).inflate(R.layout.activity_main, null, false)
        setContentView(view)

        Toast.makeText(this, "插件的MainActivity", Toast.LENGTH_SHORT).show()
    }
}
