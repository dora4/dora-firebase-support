dora-firebase-support
![Release](https://jitpack.io/v/dora4/dora-firebase-support.svg)
--------------------------------

#### gradle依赖配置

```groovy
// 添加以下代码到项目根目录下的build.gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
// 添加以下代码到app模块的build.gradle
dependencies {
    // 扩展包必须在有主框架dora的情况下使用
    implementation 'com.github.dora4:dora:1.1.25'
    implementation 'com.github.dora4:dora-firebase-support:1.0'
}
```

#### 使用方式

在AndroidManifest中加入配置。
```xml
<application>
        <!-- Dora生命周期注入的配置 -->
        <meta-data
            android:name="dora.lifecycle.config.FirebaseGlobalConfig"
            android:value="GlobalConfig"/>
</application>
```

在app模块加入google-services.json并在其build.gradle.kts加入以下代码。
```kotlin
plugins {
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}
```


