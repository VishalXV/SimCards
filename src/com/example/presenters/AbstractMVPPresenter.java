package com.example.presenters;

import android.app.Activity;
import android.view.View;

import com.example.views.AbstractMVPActivity;

public abstract class AbstractMVPPresenter {
	
	protected Activity activity;
	
	public AbstractMVPPresenter(Activity activity) {
	    this.activity = activity;
	}
	/**
	 * 
	 * @param v
	 */
	public abstract void onClick(View v);
	public abstract void update();
	
	
}
