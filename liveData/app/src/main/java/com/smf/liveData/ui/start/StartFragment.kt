package com.smf.liveData.ui.start

import android.arch.lifecycle.ViewModelProviders
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smf.liveData.R
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.*
import kotlinx.android.synthetic.main.start_fragment.*



class StartFragment : Fragment() {

	companion object {
		fun newInstance() = StartFragment()
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		Log.d(getString(R.string.StartFragment), getString(R.string.onCreate))

		// Set up a LiveData Observer
		val viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
		viewModel.getCurrentTime().observe(this,
				Observer { timeString -> timeView.text = timeString })

		// Called if there is no active network request
		viewModel.initNetworkRequest()

	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
							  savedInstanceState: Bundle?): View {

		Log.d(getString(R.string.StartFragment), getString(R.string.onCreateView))

		return inflater.inflate(R.layout.start_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)

		Log.d(getString(R.string.StartFragment), getString(R.string.onActivityCreated))

		// Get a reference to the viewModel
		val viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)


		// Use the ViewModel

		// Set the textView
		textView.text = viewModel.getTVtext()


		// Set the timeView
		// Define a formatter
		val formatter = SimpleDateFormat(getString(R.string.dateFormat), Locale.US)

		// Setup a timer
		Timer().scheduleAtFixedRate( 5000, 1000) {

			// Run on the UI thread
			if (activity != null) {
				activity!!.runOnUiThread {

					// Format and store current date and time
					viewModel.setCurrentTime(formatter.format(Date()))

				}	// activity != null
			}	// runOnUiThread

		}	// Timer()

	}	// onActivityCreated()

}	// StartFragment
