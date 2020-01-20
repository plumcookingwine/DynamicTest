[DynamicTest](https://blog.csdn.net/qq_22090073/article/details/103946596)
### 该demo不能运行在anroid10以上的手机，如果要运行demo， 请先将两个插件文件放入sd卡根目录。

# 从零开始实现一个插件化框架（一）

## 什么是插件化

### 概念

> 插件化技术最初源于免安装运行 apk 的想法，这个免安装的 apk 就可以理解为插件，而支持插件的 app 我们一般叫宿主。宿主可以在运行时加载和运行插件，这样便可以将 app 中一些不常用的功能模块做成插件，一方面减小了安装包的大小，另一方面可以实现 app 功能的动态扩展。



![在这里插入图片描述](https://img-blog.csdnimg.cn/2020011211295924.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzIyMDkwMDcz,size_16,color_FFFFFF,t_70)

我们知道计算机主板就是由一系列的插槽组成的，我们需要什么功能，给它插上对应的芯片或显卡就可以了，从而实现热拔插。基于这个原理，软件方面的热拔插就是插件化

### 插件化解决的问题 

- APP的功能模块越来越多，体积越来越大，这样可以将一些业务模块做成插件化，按需加载，从而减小安装包的体积
- 模块之间的耦合度高，协同开发沟通成本越来越大
- 方法数目可能超过65535，APP占用的内存过大
- 应用之间的互相调用

### 组件化与插件化的区别

- 组件化开发就是将一个app分成多个模块，每个模块都是一个组件，开发的过程中我们可以让这些组件相互依赖或者单独调试部分组件等，但是最终发布的时候是将这些组件合并统一成一个apk，这就是组件化开发。

- 插件化开发和组件化略有不同，插件化开发是将整个app拆分成多个模块，这些模块包括一个宿主和多个插件，每个模块都是一个apk，最终打包的时候宿主apk和插件apk分开打包。

### 各插件化框架对比

市面上比较流行的插件化框架也有很多，他们之间都有哪些区别呢？

|            **特性**            | **dynamic-load-apk** | **DynamicAPK** |   **Small**    | **DroidPlugin** | **VirtualAPK** |
| :----------------------------: | :------------------: | :------------: | :------------: | :-------------: | :------------: |
|              作者              |        任玉刚        |      携程      |    wequick     |       360       |      滴滴      |
|          支持四大组件          |    只支持Activity    | 只支持Activity | 只支持Activity |     全支持      |     全支持     |
| 组件无需在宿主manifest中预注册 |          √           |       ×        |       √        |        √        |       √        |
|        插件可以依赖宿主        |          √           |       √        |       √        |        ×        |       √        |
|       支持PendingIntent        |          ×           |       ×        |       ×        |        √        |       √        |
|        Android特性支持         |        大部分        |     大部分     |     大部分     |    几乎全部     |    几乎全部    |
|           兼容性适配           |         一般         |      一般      |      中等      |       高        |       高       |
|            插件构建            |          无          |    部署aapt    |   Gradle插件   |       无        |   Gradle插件   |

我们在选择开源框架的时候，需要根据自身的需求来，如果加载的插件不需要和宿主有任何耦合，也无须和宿主进
行通信，比如加载第三方 App，那么推荐使用 RePlugin，其他的情况推荐使用 VirtualApk。

## 插件化实现

插件apk是没有安装的，那么怎么让宿主去加载它呢？我们知道，一个apk是有代码和资源组成的，所以只需要考虑两个问题即可：

- 如何加载插件中的类？

- 如何加载插件中的资源？ 

- 当然还有最重要的一个问题，四大组件如何调用呢？四大组件是需要注册的，而插件apk中的组件显然不会在宿主提前注册，那么如何去调用它呢？

下面我们就来一步一步解决这些问题

### ClassLoader类加载器

以前在讲热修复的时候，我简单地介绍了一下[ClassLoader的加载机制](https://blog.csdn.net/qq_22090073/article/details/103369591)。java源码文件在编译后会生成一个class文件，而在Android中，将代码编译后会生成一个 apk 文件，将 apk 文件解压后就可以看到其中有一个或多个 classes.dex 文件，它就是安卓把所有 class 文件进行合并，优化后生成的。

java 中 JVM 加载的是 class 文件，而安卓中 DVM 和 ART 加载的是 dex 文件，虽然二者都是用的 ClassLoader 加
载的，但因为加载的文件类型不同，还是有些区别的，所以接下来我们主要介绍安卓的 ClassLoader 是如何加载
dex 文件的。

#### ClassLoader实现类

在Android中，ClassLoader是一个抽象类，它的实现类主要分为两种类型：系统类加载器(BootClassLoader)，和自定义类加载器(PathClassLoader | DexClassLoader)

- BootClassLoader

  用于加载Android Framework层的class文件，比如 Activity、Fragment，不过需要注意的是AppCompatActivity虽然也是google工程师提供的类，但是一个第三方包中的类，并不输入Framwork层，所以AppCompatActivity并不是使用BootClassLoader加载的

- PathClassLoader

  用于Android应用程序类加载器。可以加载指定的dex， 以及jar、zip、apk中的classes.dex

- DexClassLoader

  在Android8.0以后的API中，和 PathClassLoader是没有任何区别的，而在以前的API中，两者只有一个设置加载路径的区别（有的文章说，PathClassLoader只支持直接操作dex格式文件，而DexClassLoader可以支持.apk、.jar和.dex文件，并且会在指定的outpath路径释放出dex文件。**其实不然，甚至可以说两者没有任何区别**）



![在这里插入图片描述](https://img-blog.csdnimg.cn/20200112135245859.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzIyMDkwMDcz,size_16,color_FFFFFF,t_70)



先放一张ClassLoader类继承关系图，相信都能看懂，就不多讲了，下面来看一下PathClassLoader 和 DexClassLoader的源码：

```java
// /libcore/dalvik/src/main/java/dalvik/system/PathClassLoader.java
public class PathClassLoader extends BaseDexClassLoader {
	// optimizedDirectory 直接为 null
	public PathClassLoader(String dexPath, ClassLoader parent) {
		super(dexPath, null, null, parent);
	}
	// optimizedDirectory 直接为 null
	public PathClassLoader(String dexPath, String librarySearchPath, ClassLoader parent) 	{
		super(dexPath, null, librarySearchPath, parent);
	}
}
```

```java
// API 小于等于 26/libcore/dalvik/src/main/java/dalvik/system/DexClassLoader.java
public class DexClassLoader extends BaseDexClassLoader {
	public DexClassLoader(String dexPath, String optimizedDirectory,
		String librarySearchPath, ClassLoader parent) {
		// 26开始，super里面改变了，看下面两个构造方法
		super(dexPath, new File(optimizedDirectory), librarySearchPath, parent);
	}
}
```

```java
// API 26/libcore/dalvik/src/main/java/dalvik/system/BaseDexClassLoader.java
public BaseDexClassLoader(String dexPath, File optimizedDirectory,
	String librarySearchPath, ClassLoader parent) {
		super(parent);
		// DexPathList 的第四个参数是 optimizedDirectory，可以看到这儿为 null
		this.pathList = new DexPathList(this, dexPath, librarySearchPath, null);
}
```

```java
// API 25/libcore/dalvik/src/main/java/dalvik/system/BaseDexClassLoader.java
public BaseDexClassLoader(String dexPath, File optimizedDirectory,
			String librarySearchPath, ClassLoader parent) {
		super(parent);
		this.pathList = new DexPathList(this, dexPath, librarySearchPath, 		optimizedDirectory);
}
```

根据源码就可以了解到，PathClassLoader 和 DexClassLoader 都是继承自 BaseDexClassLoader，且类中只有构造方法，它们的类加载逻辑完全写在 BaseDexClassLoader 中。

其中我们值的注意的是，在8.0之前，它们二者的唯一区别是第二个参数 optimizedDirectory，这个参数的意思是
生成的 odex（优化的dex）存放的路径，PathClassLoader 直接为null，而 DexClassLoader 是使用用户传进来的
路径，而在8.0之后，二者就完全一样了。

下面我们再来了解下 BootClassLoader 和 PathClassLoader 之间的关系：// 在 onCreate 中执行下面代码

```java
ClassLoader classLoader = getClassLoader();
while (classLoader != null) {
	Log.e("leo", "classLoader:" + classLoader);
	classLoader = classLoader.getParent();
}
Log.e("leo", "classLoader:" + Activity.class.getClassLoader());
```

打印结果：

```
classLoader:dalvik.system.PathClassLoader[DexPathList[[zip file
"/data/user/0/com.enjoy.pluginactivity/cache/plugin-debug.apk", zip file
"/data/app/com.enjoy.pluginactivity-T4YwTh-
8gHWWDDS19IkHRg==/base.apk"],nativeLibraryDirectories=[/data/app/com.enjoy.pluginactivity-
T4YwTh-8gHWWDDS19IkHRg==/lib/x86_64, /system/lib64, /vendor/lib64]]]
classLoader:java.lang.BootClassLoader@a26e88d
classLoader:java.lang.BootClassLoader@a26e88d
```

通过打印结果可知，应用程序类是由 PathClassLoader 加载的，Activity 类是 BootClassLoader 加载的，并且
BootClassLoader 是 PathClassLoader 的 parent，这里要注意 parent 与父类的区别。这个打印结果我们下面还
会提到。

#### 加载原理

那么如何使用类加载器去从dex中加载一个插件类呢？很简单

比如，有一个apk文件，路径是apkPath，里面有个类com.plugin.Test，就可以通过反射加载一个类：

```
// 初始化一个类加载器
DexClassLoader classLoader = new DexClassLoader(dexPath, context.getCacheDir().getAbsolutePath, null, context.getClassLoader);
// 获取插件中的类
Class<?> clazz = classLoader.loadClass("com.plugin.Test");
// 调用类中的方法
Method method = clazz.getMethod("test", Context.class)
method.invoke(clazz.newInstance(), this)
```

dex中加载类很简单，但是我们需要的是将插件中的dex加载到宿主里面，又该怎么做呢？其实原理还是跟热修复一样，下面就以API 26 Android 8.0举例，通过源码，看一下DexClassLoader类加载器是怎么加载一个apk中的dex文件的。

通过查找发现，DexClassLoader并没有加载类的方法，继续看它的父类，最后在ClassLoader类中找到了一个loadClass方法，看来就是通过这个方法来加载类了：

```java
protected Class<?> loadClass(String name, boolean resolve)
        throws ClassNotFoundException
    {
            // 1. 检测这个类是否已经被加载，如果已经被加载了就可以直接返回了
            Class<?> c = findLoadedClass(name);
    		// 如果类未被加载
            if (c == null) {
                try {
                    // 2. 判断是否有上级加载器，使用上级加载器的loadClass方法去加载
                    if (parent != null) {
                        c = parent.loadClass(name, false);
                    } else {
                        // 正常情况下是不会走到这里的，因为最终ClassLoader都会走到BootClassLoader，重写了loadClass方法结束掉了递归
                        c = findBootstrapClassOrNull(name);
                    }
                } catch (ClassNotFoundException e) {
                }
				// 3. 如果所有的上级都没找到，就调用findClass方法去查找
                if (c == null) {
                    c = findClass(name);
                }
            }
            return c;
    }
```

上面类加载分为了3个步骤

1、 检测这个类是否已经被加载，最终会调用到native方法实现查找，这里就不深入了：

```java
 protected final Class<?> findLoadedClass(String name) {
        ClassLoader loader;
        if (this == BootClassLoader.getInstance())
            loader = null;
        else
            loader = this;
     	//native方法
        return VMClassLoader.findLoadedClass(loader, name);
}
```

2、如果没被找到，就会从parent中调用loadClass方法去查找，依次递归，如果找到了就返回，如果所有的上级都没有找到，又会调用到findClass一级一级的去查找。这个过程就是**双亲委托机制**

3、 findClass

```java
// -->2 加载器一般都会重写这个方法，定义自己的加载规则
protected Class<?> findClass(String name) throws ClassNotFoundException {
	throw new ClassNotFoundException(name);
}
```

根据前面的打印结果我们可以看懂，ClassLoader的最上级是BootClassLoader，来 看下它是如何重写的loadClass方法，结束递归的：

```java
class BootClassLoader extends ClassLoader {
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return Class.classForName(name, false, null);
	}
	@Override
	protected Class<?> loadClass(String className, boolean resolve)
		throws ClassNotFoundException {
		Class<?> clazz = findLoadedClass(className);
		if (clazz == null) {
			clazz = findClass(className);
		}
		return clazz;
	}
}
```

从上面可以看到 BootClassLoader 重写了 findClass 和 loadClass 方法，并且在 loadClass 方法中，不再获取 parent，从而结束了递归。

接着往下走，如果所有的parent都没找到，DexClassLoader是如何加载的，通过查找，其实现方法在它的父类BaseDexClassLoader中：

```java
// /libcore/dalvik/src/main/java/dalvik/system/BaseDexClassLoader.java
@Override
protected Class<?> findClass(String name) throws ClassNotFoundException {
	// 在 pathList 中查找指定的 Class
	Class c = pathList.findClass(name, suppressedExceptions);
	return c;
}
public BaseDexClassLoader(String dexPath, File optimizedDirectory,
						  String librarySearchPath, ClassLoader parent) {
	super(parent);
	// 初始化 pathList
	this.pathList = new DexPathList(this, dexPath, librarySearchPath, null);
}
```

findClass中有调用了DexPathList中的findClass方法，继续：

```java
private Element[] dexElements;
public Class<?> findClass(String name, List<Throwable> suppressed) {
	//通过 Element 获取 Class 对象
	for (Element element : dexElements) {
		Class<?> clazz = element.findClass(name, definingContext, suppressed);
		if (clazz != null) {
			return clazz;
		}
	}
	return null;
}
```

到这里一目了然，class对象就是从Element中获得的，而每一个Element就对应了一个dex文件，因为一个apk中dex文件可能有多个，所以就使用了数组来盛放Element。到这里加载apk中的类大家是不是就有思路了？

1. 创建插件的ClassLoader加载器（PathClassLoader或DexClassLoader），然后通过反射，获取插件的dexElements数组的值
2. 获取宿主的ClassLoader加载器，通过反射获取宿主的dexElements数组的值。
3. 合并宿主和插件的dexElements数组，生成一个新的数组
4. 通过反射将新的数组重新赋值给宿主的dexElements

### 实现方法

废话不多说，直接上代码：(我这里使用了kotlin，写起来感觉方便一些)

```kotlin
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
        val pluginClassLoader = PathClassLoader("sdcard/plugin-debug.apk", context.classLoader)
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
        // 将生成的新值赋给 "dexElements" 属性
        dexElementsField.set(hostPathList, newElements)

    }
```

这样就合并了两个dex文件的类，宿主中就可以直接加载插件中的类了

```kotlin
private fun loadApk() {
        try {
            val clazz = Class.forName("com.kangf.plugin.Test")
            val method = clazz.getMethod("test", Context::class.java)
            method.invoke(clazz.newInstance(), this)
        } catch (e: Exception) {
            e.printStackTrace()
            // 调用上面的load方法
            Toast.makeText(this, "请先点击加载apk", Toast.LENGTH_LONG).show()
        }
}
```

时间关系，今天就讲到这里，还有两个问题（加载资源图片和四大组件），留到下一篇文章再讲

源码已经上传到github，有需要的可以看一下

好了，来看一下运行效果吧：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200112154509716.gif)
