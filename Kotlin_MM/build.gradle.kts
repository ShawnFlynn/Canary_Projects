buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.2.0-alpha12")
    }
}
group = "com.smf.kotlin_mm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
