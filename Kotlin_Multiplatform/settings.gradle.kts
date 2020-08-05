pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
        }
    }
    
}
rootProject.name = "Kotlin_Multiplatform"

include(":android")
include(":kotlin_mpp")
include(":Kotlin_mpp")
