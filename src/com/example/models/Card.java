package com.example.models;

import java.io.Serializable;

import android.util.Log;

public abstract class Card implements Comparable<Card>, Serializable {
    
    protected int rank;
    protected int suit;
    protected int imageId;
    
    
    public Card(int rank, int suit) {
        int calc = (rank-2) * 4 + suit;
        int imageId=PlayingCard.imageIds.get(calc);
        Log.i("ImageIds","Rank:" + rank + ", Suit: "+ suit + ", Calc: "+ calc + ", ID: " + imageId);
        this.rank=rank;
        this.suit=suit;
        this.imageId=imageId;
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
    
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    
    public boolean equals(Object o) {
        Card other = (Card) o;
        boolean rankEquality = this.rank == other.rank;
        boolean suitEquality = this.suit == other.suit;
        return rankEquality && suitEquality;
    }
    
    

}
