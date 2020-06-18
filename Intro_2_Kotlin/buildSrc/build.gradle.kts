plugins {
	kotlin("multiplatform") version "1.3.72"
}

repositories {
	mavenCentral()
	maven("https://plugins.gradle.org.m2")
	maven("http://dlbintray.com/kotlin/kotlin-eap")
	maven("https://dl.bintray.com/jetbrains/kotlin-native-dependencies")
}

kotlin {
	jvm()
	mingwX64()
}

// Source sets
sourceSets {
	getByName("main").java.srcDirs("../app/src/main/kotlin")
	getByName("test").java.srcDirs("../app/src/test/kotlin")
	getByName("androidTest").java.srcDirs("../app/src/androidTest/kotlin")
	//getByName("debug").java.srcDirs("src/debug/java")
}

println(sourceSets["main"].allSource)
println(sourceSets["main"].allSource.srcDirs)
println(sourceSets["test"].allSource)
println(sourceSets["test"].allSource.srcDirs)
//println(sourceSets["androidTest"].java)
//println(sourceSets["androidTest"].java.srcDirs)
//println(sourceSets["debug"].java)
//println(sourceSets["debug"].java.srcDirs)
