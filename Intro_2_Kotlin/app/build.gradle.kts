
repositories {
    jcenter()
    mavenCentral()
}



task("Notification") {
    doLast { println("build.gradle.kts complete!") }
}