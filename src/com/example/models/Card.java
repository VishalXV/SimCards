package com.example.models;

import java.io.Serializable;

public abstract class Card implements Comparable<Card>, Serializable {
    
    protected int rank;
    protected int suit;
    protected int imageID;
    
    public Card(int rank, int suit) {
        this(rank, suit, 0);
    }
    
    public Card(int rank, int suit, int imageID) {
        this.rank = rank;
        this.suit = suit;
        this.imageID = imageID;
    }

    /**
     * @return the rank
     */
    public int getRank() {
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
    
    public int getImageID() {
        return imageID;
    }
    
    

}
