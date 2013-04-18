package com.example.test;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import eu.trentorise.smartcampus.puschservice.PushServiceActivity;

public class MainActivity extends PushServiceActivity {

	Button button;

	@SuppressWarnings("static-access")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		ApplicationInfo ai;
		try {
			ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
			  Bundle aBundle = ai.metaData;
			   String x = aBundle.getString("SENDER_ID");
			  // Log.v("test", x);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		
		String serverurl="http://192.168.41.190:8081/communicator/";
		String senderid="557126495282";
		String appName= getApplicationContext()
				.getPackageName();
		
		super.onCreate(savedInstanceState);
		super.init(serverurl,senderid,appName);
		
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
