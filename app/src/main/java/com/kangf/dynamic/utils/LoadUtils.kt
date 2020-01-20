package com.kangf.dynamic.utils

import android.content.Context
import dalvik.system.DexClassLoader
import dalvik.system.PathClassLoader
import java.lang.reflect.Array

object LoadUtils {

    fun load(context: Context) {
        // 获取 pathList
        val systemClassLoader = Class.forName("dalvik.system.BaseDexClassLoader")
        val pathListField = systemClassLoader.getDeclaredField("pathList")
        pathListField.isAccessible = true

        // 获取 dexElements
        val dexPathListClass = Class.forName("dalvik.system.DexPathList")
        val dexElementsField = dexPathListClass.getDeclaredField("dexElements")
        dexElementsField.isAccessible = true


        // 获取宿主的Elements
        val hostClassLoader = context.classLoader
        val hostPathList = pathListField.get(hostClassLoader)
        val hostElements = dexElementsField.get(hostPathList) as kotlin.Array<Any>

        // 获取插件的Elements
        val pluginClassLoader = DexClassLoader(
            "sdcard/plugin-debug.apk",
            context.cacheDir.absolutePath,
            null,
            context.classLoader
        )
        val pluginPathList = pathListField.get(pluginClassLoader)
        val pluginElements = dexElementsField.get(pluginPathList) as kotlin.Array<Any>

        // 创建数组
        val newElements =
            Array.newInstance(
                pluginElements.javaClass.componentType!!,
                hostElements.size + pluginElements.size
            ) as kotlin.Array<Any>

        // 给新数组赋值
        // 先用宿主的，再用插件的

        System.arraycopy(hostElements, 0, newElements, 0, hostElements.size)
        System.arraycopy(pluginElements, 0, newElements, hostElements.size, pluginElements.size)
        // 合并
        dexElementsField.set(hostPathList, newElements)

    }

}