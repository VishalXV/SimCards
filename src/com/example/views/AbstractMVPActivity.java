package com.example.views;

import android.view.View;

import com.example.presenters.AbstractMVPPresenter;
import com.kinvey.android.activities.BaseRemoteActivity;

public abstract class AbstractMVPActivity extends BaseRemoteActivity {
	
	private AbstractMVPPresenter presenter;
	
	public void onClick(View v) {
		presenter.onClick(v);
	}
	
	public void linkPresenter(AbstractMVPPresenter presenter) {
		this.presenter = presenter;
	}
}
