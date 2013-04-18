package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import eu.trentorise.smartcampus.puschservice.GCMIntentServiceExtended;
import eu.trentorise.smartcampus.puschservice.GCMServerUtilities;

public class GCMIntentService extends GCMIntentServiceExtended {


	@Override
	protected void onMessage(Context context, Intent intent) {
		Log.v("GCM","Message received");

	}

	@Override
	protected void onDeletedMessages(Context context, int total) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(Context context, String errorId) {
		// TODO Auto-generated method stub

	}

}
