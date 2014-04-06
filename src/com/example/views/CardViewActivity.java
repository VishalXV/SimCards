package com.example.views;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.models.Card;
import com.example.models.CardAdapter;
import com.example.models.Hand;
import com.example.models.PlayingCard;
import com.example.presenters.CardViewPresenter;
import com.example.simcards.R;

public class CardViewActivity extends AbstractMVPBluetoothActivity {

	CardViewPresenter presenter;
	ArrayList<Card> selected;
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.card_view, menu);
		return true;
	}

	@Override
	public void onNewMessage(String message) {
		Log.i("CardView", "New message recieved"+message);
		presenter.onNewMessage(message);
	}
	
	 @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        presenter = new CardViewPresenter(this);
        Hand testHand = new Hand();
        selected = new ArrayList<Card>();
        testHand.addCard(new PlayingCard(PlayingCard.RANK_TWO,PlayingCard.SUIT_DIAMOND));
        testHand.addCard(new PlayingCard(PlayingCard.RANK_THREE,PlayingCard.SUIT_CLUB));
        testHand.addCard(new PlayingCard(PlayingCard.RANK_FOUR,PlayingCard.SUIT_DIAMOND));
        testHand.addCard(new PlayingCard(PlayingCard.RANK_KING,PlayingCard.SUIT_HEART));
        setCardAdapter(testHand.getArrayList());
        setOnItemClickListener(new OnItemClickListenerListViewItem());
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
	public ArrayList<Card> getSelectedCards(){
		return selected;
	}
	 
	public class OnItemClickListenerListViewItem implements OnItemClickListener {

		    @Override
		    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

		        Context context = view.getContext();
		        

		        Card c = (Card) parent.getAdapter().getItem(position);
		        if (selected.contains(c))
		        {
		        	selected.remove(c);
		        	view.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        	
		        }else{
		        	
		        	selected.add(c);
		        	view.setBackgroundResource(R.drawable.transparency);
		        	
		        }
		        Log.i("Lgo","Size:"+selected.size());

		        // just toast it
		        //Toast.makeText(context, "Item: " + c.toString() , Toast.LENGTH_SHORT).show();

		        //((MainActivity) context).alertDialogStores.cancel();

		    }


	}
	
	public void disablePlay() {
        Button button = (Button) findViewById(R.id.cardView_button_play);
        button.setEnabled(false);
    }
    
	public void disableCallBluff() {
        Button button = (Button) findViewById(R.id.cardView_button_callBluff);
        button.setEnabled(false);
    }
    
	public void disablePass() {
        Button button = (Button) findViewById(R.id.cardView_button_pass);
        button.setEnabled(false);
    }
	
	public void sendMessage(String message) {
	    super.sendMessage(message);
	}	 
	    
}
	

