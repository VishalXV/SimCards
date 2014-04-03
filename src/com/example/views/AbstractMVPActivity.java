package com.example.views;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.example.presenters.AbstractMVPPresenter;

public abstract class AbstractMVPActivity extends Activity {
	
	private AbstractMVPPresenter presenter;
	
	public void onClick(View v) {
	    String buttonId = v.getResources().getResourceName(v.getId());
	    Log.i("Taps", buttonId + " was pressed");
		presenter.onClick(v);
	}
	
	public void linkPresenter(AbstractMVPPresenter presenter) {
		this.presenter = presenter;
	}
}
