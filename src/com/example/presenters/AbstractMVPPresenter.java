package com.example.presenters;

import android.view.View;

import com.example.views.AbstractMVPActivity;

public abstract class AbstractMVPPresenter {
	
	protected AbstractMVPActivity activity;
	
	public AbstractMVPPresenter(AbstractMVPActivity activity) {
		this.activity = activity;
		activity.linkPresenter(this);
	}
	/**
	 * 
	 * @param v
	 */
	public abstract void onClick(View v);
	public abstract void update();
	
	
}
