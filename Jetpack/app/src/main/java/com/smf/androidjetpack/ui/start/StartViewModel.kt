package com.smf.androidjetpack.ui.start

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

class StartViewModel : ViewModel() {

	// Final member
	private val _data = MutableLiveData<String>()
	init {
		// TODO - get string from striings.xml
		_data.value = "Hello, Jetpack!"
	}
	val data: LiveData<String>
		get() = _data

	// Variable member
	private var _current = MutableLiveData<String>()
	init {
		// TODO - get string from striings.xml
		_current.value = "Today"
	}
	var current: MutableLiveData<String> = MutableLiveData()
		get() = _current
}
