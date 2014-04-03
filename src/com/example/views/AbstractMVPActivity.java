package com.example.views;

import android.app.Activity;
import android.view.View;

import com.example.presenters.AbstractMVPPresenter;

public abstract class AbstractMVPActivity extends Activity {
	
	private AbstractMVPPresenter presenter;
	
	public void onClick(View v) {
		presenter.onClick(v);
	}
	
	public void linkPresenter(AbstractMVPPresenter presenter) {
		this.presenter = presenter;
	}
}