package com.example.views;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

import com.example.models.Card;
import com.example.models.CardAdapter;
import com.example.presenters.CardViewPresenter;
import com.example.simcards.R;

public class CardViewActivity extends AbstractMVPBluetoothActivity {

	CardViewPresenter presenter;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.card_view, menu);
		return true;
	}

	@Override
	public void onNewMessage(String message) {
		Log.i("CardView", "New message recieved"+message);
		
	}
	
	 @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        presenter = new CardViewPresenter(this);
        
    }
	 
	public GridView getCardGrid() {
		return (GridView) findViewById(R.id.card_grid);
	}
	public void setCardAdapter(ArrayList<Card> cards) {
		getCardGrid().setAdapter(new CardAdapter(this, R.layout.card, cards));
	}
	public void setOnItemClickListener(OnItemClickListener o) {
		getCardGrid().setOnItemClickListener(o);
	}
	 
	 public class OnItemClickListenerListViewItem implements OnItemClickListener {

		    @Override
		    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

		        Context context = view.getContext();


		        Card c = (Card) parent.getAdapter().getItem(position);


		        // just toast it
		        Toast.makeText(context, "Item: " + c.toString() , Toast.LENGTH_SHORT).show();

		        //((MainActivity) context).alertDialogStores.cancel();

		    }

	 }  
	 
	    
}
	

