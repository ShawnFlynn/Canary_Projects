package com.smf.apipermissions;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifecycleLoggingActivity extends Activity {

	protected final String TAG = getClass().getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate()");
	}


	@Override
	public void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart()");
	}


	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "onStart()");
	}


	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "onResume()");
	}


	@Override
	public void onPause() {
		Log.d(TAG, "onPause()");
		super.onPause();
	}


	@Override
	public void onStop() {
		Log.d(TAG, "onStop()");
		super.onStop();
	}


	@Override
	public void onDestroy() {
		Log.d(TAG, "onDestroy()");
		super.onDestroy();
	}
}
