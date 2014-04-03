package com.example.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.presenters.AbstractMVPPresenter;
import com.example.simcards.R;

public abstract class AbstractMVPActivity extends Activity {
	
	protected AbstractMVPPresenter presenter;
		
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	
	public void onClick(View v) {
	    String buttonId = v.getResources().getResourceName(v.getId());
	    Log.i("Taps", buttonId + " was pressed");
		startActivity(new Intent(this, HostActivity.class));
	    //presenter.onClick(v);
	}
	
	public void linkPresenter(AbstractMVPPresenter presenter) {
		this.presenter = presenter;
	}
}
