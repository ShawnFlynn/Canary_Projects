package com.smf.androidjetpack.ui.start

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.MutableLiveData

class StartViewModel : ViewModel() {

	// Final member
	private val TVtext = MutableLiveData<String>()
	init {
		// TODO - get string from strings.xml
		TVtext.value = "Hello, Jetpack!"
	}

	fun getTVtext() = TVtext.value


	// Variable member
	private var currentTime = MutableLiveData<String>()

	/* Called on app launch */
	fun initNetworkRequest() {
		/* expensive operation, e.g. network request */
		// TODO - get string from strings.xml
		currentTime.value = "Today"
	}

	// Getter
	fun getCurrentTime() = currentTime

	// Setter
	fun setCurrentTime(timeValue: String)  {
		currentTime.value = timeValue
	}

}	// StartViewModel
