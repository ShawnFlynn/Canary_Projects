package com.smf.androidjetpack.ui.start

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smf.androidjetpack.R
import kotlinx.android.synthetic.main.start_fragment.*
import java.text.SimpleDateFormat

import java.util.*
import kotlin.concurrent.*

class StartFragment : Fragment() {

	private lateinit var viewModel: StartViewModel

	companion object {
		fun newInstance() = StartFragment()
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
							  savedInstanceState: Bundle?): View {

		Log.d("StartFragment", "onCreateView()")

		return inflater.inflate(R.layout.start_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)

		Log.d("StartFragment", "onActivityCreated()")

		viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)

		// Use the ViewModel

		// Set the textView
		textView.text = viewModel.data.value

		// Set the timeView
		// Define a formatter
		val formatter = SimpleDateFormat(getString(R.string.dateFormat))

		// Setup a timer
		Timer().scheduleAtFixedRate( 5000, 1000) {

			if (activity != null) {
				activity!!.runOnUiThread {

					// Format and store current date and time
					viewModel.current.value = formatter.format(Date())

					// TODO - get string when it changes - LiveData
					// Set the timeView with the current date and time
					timeView.text = viewModel.current.value

				}	// activity != null
			}	// runOnUiThread

		}	// Timer()

	}	// onActivityCreated()

}	// StartFragment
