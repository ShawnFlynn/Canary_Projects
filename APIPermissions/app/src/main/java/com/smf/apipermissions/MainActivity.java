package com.smf.apipermissions;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.util.Log;

public class MainActivity extends LifecycleLoggingActivity {

	static final int REQUEST_PERMISSIONS = 121;

	private int permissionCount = 0;
	private final List<String> permissions = new ArrayList<>();

	private Activity mActivity;
	private Context  mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Save the activity
		mActivity = this;

		// Save the context
		mContext = getBaseContext();

		// Get the non-granted permissions
		getPermissions();

		// Request permissions if required
		if (!permissions.isEmpty()) {
			requestPermissions();
		}

	}	// end - onCreate()

	public void getPermissions() {

		Log.i(TAG, "getPermissions()");

		PackageManager pm = getPackageManager();

		try {

			// Get the package name
			PackageInfo packageInfo = pm.getPackageInfo(mContext.getPackageName(),
												PackageManager.GET_PERMISSIONS);

			// Get package specified permissions
			String[] requestedPermissions = packageInfo.requestedPermissions;

			// Generate a list of permissions not-granted
			if(requestedPermissions != null) {
				for (String requestedPermission : requestedPermissions) {

					// Loop through non-granted permissions
					if(ActivityCompat.checkSelfPermission(mContext,requestedPermission)
							!= PackageManager.PERMISSION_GRANTED) {

						// Add to the list
						permissions.add(requestedPermission);
						permissionCount++;

						Log.i(TAG, requestedPermission + " to be requested");
					} else {
						Log.i(TAG, requestedPermission + " already granted");
					}
				}
			}
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

	}	// end - getPermissions()


	public void requestPermissions() {

		Log.i(TAG, "requestPermissions()");

		// Prompt for permissions
		String[] params = permissions.toArray(new String[permissions.size()]);
		ActivityCompat.requestPermissions(mActivity, params, REQUEST_PERMISSIONS);

	}	// end - requestPermissions()

	@Override
	public void onRequestPermissionsResult( int requestCode,
											String[] permissions,
											int[] grantResults) {

		boolean permissionsGranted = true;

		Log.i(TAG, "onRequestPermissionResult()");

		// Check the request code
		if (requestCode == REQUEST_PERMISSIONS) {
			if(grantResults.length == permissionCount) {

				for (int i=0; i<grantResults.length; i++) {

					if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {

						Log.i(TAG, permissions[i] + " granted");
					} else {
						Log.i(TAG, permissions[i] + " not granted");
						permissionsGranted = false;
					}
				}
			}
		}

		// Log the results
		if (permissionsGranted)
			Log.i(TAG, "All Permissions granted");
		else
			Log.i(TAG, "Not All Permissions granted");

	}	// end - onRequestPermissionsResult()

}	// end - MainActivity
