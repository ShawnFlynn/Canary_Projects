
const val KOTLIN_VERSION = "1.3.72"
const val GRADLE_PLUGIN  = "4.2.0-alpha01"

object BuildPlugins {
	const val androidGradlePlugin = "com.android.tools.build:gradle:$GRADLE_PLUGIN"
	const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
	const val androidApplication = "com.android.application"
	const val kotlinAndroid = "kotlin-android"
	const val kotlinAndroidExtensions = "kotlin-android-extensions"
}

object AndroidSdk {
	const val min = 15
	const val compile = 28
	const val target = compile
}

object Libraries {
	private object Versions {
//        const val jetpack = "1.0.0-beta01"
	}

	const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$KOTLIN_VERSION"
//    const val appCompat = "androidx.appcompat:appcompat:${jetpack}"
}

object TestLibraries {
	private object Versions {
		const val junit4     = "4.12"
		const val testRunner = "1.1.0-alpha4"
		const val espresso   = "3.1.0-alpha4"
	}
	const val junit4     = "junit:junit:${Versions.junit4}"
	const val testRunner = "androidx.test:runner:${Versions.testRunner}"
	const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
