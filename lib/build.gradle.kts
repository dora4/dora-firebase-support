plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

android {
    namespace = "dora.lifecycle.firebase"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
}

fun DependencyHandlerScope.firebase(version: String) {
    api(platform("com.google.firebase:firebase-bom:$version"))
    api("com.google.firebase:firebase-crashlytics-ktx")
    api("com.google.firebase:firebase-crashlytics")
    api("com.google.firebase:firebase-analytics-ktx")
    api("com.google.firebase:firebase-analytics")
    api("com.google.firebase:firebase-config-ktx")
    api("com.google.firebase:firebase-config")
}

dependencies {
    implementation("com.github.dora4:dora:1.1.25")
    firebase("32.2.2")
}

afterEvaluate {
    publishing {
        publications {
            register("release", MavenPublication::class) {
                from(components["release"])
                groupId = "com.github.dora4"
                artifactId = "dora-firebase-support"
                version = "1.1"
            }
        }
    }
}