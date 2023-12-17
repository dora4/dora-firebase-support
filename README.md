dora-firebase-support
![Release](https://jitpack.io/v/dora4/dora-firebase-support.svg)
--------------------------------

#### gradle依赖配置

添加以下代码到项目根目录下的settings.gradle.kts
```kotlin
pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.google.firebase") {
                useModule("com.google.firebase:firebase-crashlytics-gradle:2.9.2")
            }
        }
    }
}
dependencyResolutionManagement { {
    repositories {
        maven { setUrl("https://jitpack.io") }
    }
}
```
添加以下代码到项目根目录下的build.gradle.kts
```kotlin
plugins {
    id("com.google.gms.google-services") version("4.3.15") apply(false)
    id("com.google.firebase.firebase-perf") version("1.4.2") apply(false)
}
```
添加以下代码到app模块的build.gradle.kts
```kotlin
dependencies {
    // 扩展包必须在有主框架dora的情况下使用
    implementation("com.github.dora4:dora:1.1.46")
    implementation("com.github.dora4:dora-firebase-support:1.8")
}
```

在app模块加入google-services.json并在其build.gradle.kts加入以下代码。
```kotlin
plugins {
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("com.google.firebase.firebase-perf")
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

使用SpmUtils的工具方法埋点统计，使用activity和fragment以spm开头的扩展函数也可以。

```kotlin
spmSelectContent("查看官方公告详情")             
```

添加以下代码检测性能。
```kotlin
// Import these Performance Monitoring classes at the top of your `.kt` file
import com.google.firebase.perf.FirebasePerformance
import com.google.firebase.perf.metrics.AddTrace

// Add the `@AddTrace` annotation above the method you want to trace
// the `enabled` argument is optional and defaults to true
@AddTrace(name = "onCreateTrace", enabled = true)
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
}
```



