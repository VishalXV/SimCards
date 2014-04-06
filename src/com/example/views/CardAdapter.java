package com.example.views;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.models.Card;
import com.example.simcards.R;

public class CardAdapter extends ArrayAdapter<Card> {

    Context mContext;
    int layoutResourceId;
    ArrayList<Card> list;
    
    public CardAdapter(Context mContext, int layoutResourceId, ArrayList<Card> list) {
        super(mContext, layoutResourceId, list);
        this.mContext = mContext;
        this.layoutResourceId = layoutResourceId;
        this.list = list;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
         * The convertView argument is essentially a "ScrapView" as described is Lucas post 
         * http://lucasr.org/2012/04/05/performance-tips-for-androids-listview/
         * It will have a non-null value when ListView is asking you recycle the row layout. 
         * So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
         */
        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        // object item based on the position
        Card card = list.get(position);

        // get the TextView and then set the text (item name) and tag (item ID) values
        ImageView imageViewItem = (ImageView) convertView.findViewById(R.id.cardViewItem);
        imageViewItem.setImageResource(card.getImageID());

        return convertView;

    }
    
}
