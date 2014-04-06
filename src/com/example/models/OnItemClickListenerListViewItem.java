package com.example.models;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.simcards.R;
import com.example.views.MainActivity;

/*
 * Here you can control what to do next when the user selects an item
 */
public class OnItemClickListenerListViewItem implements OnItemClickListener {

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Context context = view.getContext();


        Card c =(Card) parent.getAdapter().getItem(position);


        // just toast it
        Toast.makeText(context, "Item: " + c.toString(), Toast.LENGTH_SHORT).show();

        //((MainActivity) context).alertDialogStores.cancel();

    }

}