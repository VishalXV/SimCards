package com.example.views;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.simcards.R;

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


	public void onDeviceResponse(boolean success) {
		
		Log.i("BT","Device Responce");
		
	}
	public void onClick(View v){
		
		TextView inputBox = (TextView) findViewById(R.id.host_editText_message);
		if (inputBox.getText().toString()!=null){
			
			sendMessage(inputBox.getText().toString());
			
		}
		
	}
	
	public void onWriteSuccess(String message){
		
		super.onWriteSuccess(message);
		//Log.i("BT","Send success");
		TextView inputBox = (TextView) findViewById(R.id.host_editText_message);
		inputBox.setText("");
		
	}
	
	public void onNewMessage(String message){
		
		TextView messagelist = (TextView) findViewById(R.id.host_textView_messageBox);
		messagelist.append("\n"+message);
		
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
