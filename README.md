# FlowLayout
使用Kotlin编写的流式布局（标签布局），支持设置标签gravity
## 截图
![Image text](https://github.com/ironbear775/FlowLayout/blob/master/screenshot/device-2019-09-15-183739.png?raw=true)
![Image text](https://github.com/ironbear775/FlowLayout/blob/master/screenshot/device-2019-09-15-183753.png?raw=true)
![Image text](https://github.com/ironbear775/FlowLayout/blob/master/screenshot/device-2019-09-15-183802.png?raw=true)
![Image text](https://github.com/ironbear775/FlowLayout/blob/master/screenshot/device-2019-09-15-183819.png?raw=true)

## 集成

[![](https://jitpack.io/v/ironbear775/FlowLayout.svg)](https://jitpack.io/#ironbear775/FlowLayout)

### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

### Step 2. Add the dependency
```groovy
dependencies {
	implementation 'com.github.ironbear775:FlowLayout:1.0.0'
}
```

## 使用
布局文件中声明，通过`flowGravity`设置标签摆放方式，支持`start`,`center`,`end`

```xml
<com.ironbear775.android.flowlayoutlibrary.FlowLayout
    android:id="@+id/flowLayout"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    app:flowGravity="start" />
```

代码中设置gravity

```kotlin
flowLayout.setGravity(FlowLayout.START)
flowLayout.setGravity(FlowLayout.CENTER)
flowLayout.setGravity(FlowLayout.END)
```
