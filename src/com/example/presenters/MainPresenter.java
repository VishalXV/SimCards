package com.example.presenters;

import android.content.Intent;
import android.view.View;

import com.example.simcards.R;
import com.example.views.MainActivity;

public class MainPresenter extends AbstractMVPPresenter {
    
    public MainPresenter(MainActivity a) {
        super(a);
    }

    @Override
    public void onClick(View v) {
        int button = v.getId();
        if (button == R.id.main_button_findGame) {
            Intent intent = new Intent(activity, HostActivity.class);
            activity.startActivity(intent);
        } else if (button == R.id.main_button_hostGame) {
            
        }
        
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }
}
