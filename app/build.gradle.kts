plugins {
    id("com.android.application")
}

android {
    namespace = "com.rudicrash4.a07diag"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.rudicrash4.a07diag"
        minSdk = 33
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0-stage1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    lint {
        abortOnError = true
        warningsAsErrors = false
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
