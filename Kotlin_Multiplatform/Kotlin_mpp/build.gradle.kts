
val kotlinVersion = "1.4.0-rc"

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("org.jetbrains.dokka") version "1.4.0-rc"
}

repositories {
    jcenter()
}

dependencies {
    "implementation" ("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    "implementation" ("com.android.support:appcompat-v7:28.0.0")
    "implementation" ("com.android.support.constraint:constraint-layout:1.1.3")
    "testImplementation" ("junit:junit:4.+")
    "androidTestImplementation" ("com.android.support.test:runner:1.0.2")
    "androidTestImplementation" ("com.android.support.test.espresso:espresso-core:3.0.2")
}

android {
    compileSdkVersion 30
    buildToolsVersion "30.0.0"

    defaultConfig {
        applicationId = "com.smf.kotlin_mpp"
        minSdkVersion = 22
        targetSdkVersion( 30 )
        versionCode( 1 )
        versionName( "1.0" )

        testInstrumentationRunner("android.support.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        release {
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
