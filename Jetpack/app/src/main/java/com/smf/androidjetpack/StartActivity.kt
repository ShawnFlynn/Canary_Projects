package com.smf.androidjetpack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.smf.androidjetpack.ui.start.StartFragment

class StartActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		Log.d("StartActivity", "onCreate()")

		setContentView(R.layout.start_activity)
		if (savedInstanceState == null) {
			supportFragmentManager.beginTransaction()
								  .replace(R.id.container, StartFragment.newInstance())
								  .commitNow()
		}
	}

}
