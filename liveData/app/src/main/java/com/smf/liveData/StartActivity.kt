package com.smf.liveData

import com.smf.liveData.ui.start.StartFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class StartActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		Log.d(getString(R.string.StartActivity), getString(R.string.onCreate))

		setContentView(R.layout.start_activity)
		if (savedInstanceState == null) {
			supportFragmentManager.beginTransaction()
								  .replace(R.id.container, StartFragment.newInstance())
								  .commitNow()
		}

	}	// onCreate()

}
