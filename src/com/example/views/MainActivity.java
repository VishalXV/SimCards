package com.example.views;

import com.example.simcards.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends AbstractMVPActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    @Override
    public void onDeviceResponse(boolean success) {
        // TODO Auto-generated method stub
        
    }

}
