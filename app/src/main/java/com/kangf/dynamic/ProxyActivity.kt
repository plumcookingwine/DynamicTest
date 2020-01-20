package com.kangf.dynamic

import android.app.Activity
import android.os.Bundle

/**
 * 什么都不需要做，只是一个代理Activity
 *
 * AMS会检测是否注册，当跳转插件Activity时，hook住跳转的intent，改成ProxyActivity
 * AMS检测完成后，再次hook住intent， 改成插件的Activity
 */
class ProxyActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proxy)


    }
}
