package com.example.views;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.presenters.AbstractMVPPresenter;
import com.example.presenters.MainPresenter;
import com.example.simcards.R;

public abstract class AbstractMVPActivity extends Activity {
	
	private AbstractMVPPresenter presenter;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
	    presenter = new MainPresenter(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	
	public void onClick(View v) {
	    String buttonId = v.getResources().getResourceName(v.getId());
	    Log.i("Taps", buttonId + " was pressed");
		presenter.onClick(v);
	}
	
	public void linkPresenter(AbstractMVPPresenter presenter) {
		this.presenter = presenter;
	}
}
