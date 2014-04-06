package com.example.models;

import java.io.Serializable;

import android.util.Log;

import com.example.simcards.R;

public abstract class Card implements Comparable<Card>, Serializable {
    
    protected int rank;
    protected int suit;
    protected int imageId;
    
    
    public Card(int rank, int suit) {
        this(rank, suit, 0);
    }
    
    public Card(int rank, int suit, int imageId) {
        this.rank = rank;
        this.suit = suit;
        this.imageId = imageId;
    }

    /**
     * @return the rank
     */
    public int getRank() {
    	Log.i("Lgo"," "+this.rank);
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * @return the suit
     */
    public int getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }
    
    public int getImageId(){
    	return this.imageId;
    }
    
    

}
