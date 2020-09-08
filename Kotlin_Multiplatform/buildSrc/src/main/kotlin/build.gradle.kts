import org.gradle.kotlin.dsl.kotlin

val kotlinURL: String by project
val appCompatURL: String by project
val constraintURL: String by project
val junitVersion: String by project
val testRunnerURL: String by project
val espressoURL: String by project

plugins {
    kotlin( "multiplatform")
    kotlin( "android" )
    kotlin( "dsl" )
    kotlin( "kapt" )
    id( "com.android.application" )
    id( "org.jetbrains.dokka" )
}

repositories {
    jcenter()
}

dependencies {
    "implementation" ( "$kotlinURL")
    "implementation" ("$appCompatURL")
    "implementation" ("$constraintURL")
    "testImplementation" ("$junitVersion")
    "androidTestImplementation" ("$testRunnerURL")
    "androidTestImplementation" ("$espressoURL")

    val appCompatURL = "com.android.support:appcompat-v7:$appCompat"
    val constraintURL = "com.android.support.constraint:constraint-layout:$constraintLayout"
    val junitURL = "junit:junit:$junitVersion"
    val testRunnerURL = "com.android.support.test:runner:$testRunnerVersion"
    val espressoURL = "com.android.support.test.espresso:espresso-core:$espressoVersion"

}
