package com.example.presenters;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

import android.app.Activity;
import android.view.View;

import com.example.models.BluffGame;
import com.example.models.BluffMove;
import com.example.models.Move;
import com.example.models.Player;
import com.example.simcards.R;
import com.example.views.CardViewActivity;

public class CardViewPresenter extends AbstractMVPPresenter {
    
    BluffGame game;
    Player current;
    
	public CardViewPresenter(Activity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClick(View v) {
		int button = v.getId();
		if(button == R.id.cardView_button_play) {
		    play();
		} else if (button == R.id.cardView_button_callBluff) {
		    callBluff();
		} else if (button == R.id.cardView_button_pass){
		    pass();
		}
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	public void play() {
	    
	}
	
	public void callBluff() {
	    BluffMove move = new BluffMove(current, BluffMove.MOVE_PASS);
	    sendMove(move);
	    game.processMove(move);
	}
	
	public void pass() {
	    BluffMove move = new BluffMove(current, BluffMove.MOVE_PASS);
	    sendMove(move);
	    game.processMove(move);
	}
	
	public void onNewMessage(String message) {
	    game.processMove(deserialize(message.getBytes()));
	}
	
	public byte[] serialize(BluffMove move) {
	    try {
    	    ByteArrayOutputStream bos =  new ByteArrayOutputStream();
    	    ObjectOutputStream oos = new ObjectOutputStream(bos);
    	    oos.writeObject(move);
    	    byte[] output = bos.toByteArray();
    	    oos.close();
    	    bos.close();
    	    return output;
	    } catch(IOException e) {
	        return null;
	    }
	}
	public BluffMove deserialize(byte[] input) {
	    try {    
	        ByteArrayInputStream bis = new ByteArrayInputStream(input);
            ObjectInputStream ois = new ObjectInputStream(bis);
            BluffMove move = (BluffMove) ois.readObject();
            ois.close();
            bis.close();
            return move;
	    } catch (StreamCorruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    
	    return null;
	}
	
	public void sendMove(BluffMove move) {
        ((CardViewActivity)activity).sendMessage(new String(serialize(move)));
	}

}
