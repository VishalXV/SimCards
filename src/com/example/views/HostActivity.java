package com.example.views;

import com.example.simcards.R;
import com.example.simcards.R.layout;
import com.example.simcards.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class HostActivity extends AbstractMVPBluetoothActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_host);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.host, menu);
		return true;
	}

	@Override
	public void onDeviceResponse(boolean success) {
		
		Log.i("BT","Device Responce");
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.bluetoothHost_menu_scanDevices:
			Log.i("BT","Pressed connect device");
			requestDeviceConnection();
			return true;
		}
		return false;
	}

}
