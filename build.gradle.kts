plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.lifeos.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.lifeos.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}

dependencies {
    implementation("com.batoulapps.adhan:adhan2:0.0.7")
}
