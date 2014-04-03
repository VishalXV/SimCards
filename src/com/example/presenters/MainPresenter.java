package com.example.presenters;

import android.content.Intent;
import android.view.View;

import com.example.simcards.R;
import com.example.views.AbstractMVPActivity;
import com.example.views.HostActivity;

public class MainPresenter extends AbstractMVPPresenter {
    
    public MainPresenter(AbstractMVPActivity a) {
        super(a);
    }

    @Override
    public void onClick(View v) {
        int button = v.getId();
        if (button == R.id.main_button_findGame) {
            
        } else if (button == R.id.main_button_hostGame) {
            Intent intent = new Intent(activity, HostActivity.class);
            activity.startActivity(intent);
        }
        
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }
}
