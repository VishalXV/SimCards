package com.example.models;

import java.util.ArrayList;

import com.example.simcards.R;

public class PlayingCard extends Card {
    
    /**
     * Suit constants
     */
    public static final int SUIT_CLUB = 0;
    public static final int SUIT_DIAMOND = 1;
    public static final int SUIT_HEART = 2;
    public static final int SUIT_SPADE = 3;
    
    /**
     * Rank constants
     */
    public static final int RANK_TWO = 2;
    public static final int RANK_THREE = 3;
    public static final int RANK_FOUR = 4;
    public static final int RANK_FIVE = 5;
    public static final int RANK_SIX = 6;
    public static final int RANK_SEVEN = 7;
    public static final int RANK_EIGHT = 8;
    public static final int RANK_NINE = 9;
    public static final int RANK_TEN = 10;
    public static final int RANK_JACK = 11;
    public static final int RANK_QUEEN = 12;
    public static final int RANK_KING = 13;
    public static final int RANK_ACE = 14;
    
    public static ArrayList<Integer> imageIds;
    
    static {
        imageIds = new ArrayList<Integer>();
        imageIds.add(R.drawable.card_1);
        imageIds.add(R.drawable.card_2);
        imageIds.add(R.drawable.card_3);
        imageIds.add(R.drawable.card_4);
        imageIds.add(R.drawable.card_5);
        imageIds.add(R.drawable.card_6);
        imageIds.add(R.drawable.card_7);
        imageIds.add(R.drawable.card_8);
        imageIds.add(R.drawable.card_9);
        imageIds.add(R.drawable.card_10);
        imageIds.add(R.drawable.card_11);
        imageIds.add(R.drawable.card_12);
        imageIds.add(R.drawable.card_13);
        imageIds.add(R.drawable.card_14);
        imageIds.add(R.drawable.card_15);
        imageIds.add(R.drawable.card_16);
        imageIds.add(R.drawable.card_17);
        imageIds.add(R.drawable.card_18);
        imageIds.add(R.drawable.card_19);
        imageIds.add(R.drawable.card_20);
        imageIds.add(R.drawable.card_21);
        imageIds.add(R.drawable.card_22);
        imageIds.add(R.drawable.card_23);
        imageIds.add(R.drawable.card_24);
        imageIds.add(R.drawable.card_25);
        imageIds.add(R.drawable.card_26);
        imageIds.add(R.drawable.card_27);
        imageIds.add(R.drawable.card_28);
        imageIds.add(R.drawable.card_29);
        imageIds.add(R.drawable.card_30);
        imageIds.add(R.drawable.card_31);
        imageIds.add(R.drawable.card_32);
        imageIds.add(R.drawable.card_33);
        imageIds.add(R.drawable.card_34);
        imageIds.add(R.drawable.card_35);
        imageIds.add(R.drawable.card_36);
        imageIds.add(R.drawable.card_37);
        imageIds.add(R.drawable.card_38);
        imageIds.add(R.drawable.card_39);
        imageIds.add(R.drawable.card_40);
        imageIds.add(R.drawable.card_41);
        imageIds.add(R.drawable.card_42);
        imageIds.add(R.drawable.card_43);
        imageIds.add(R.drawable.card_44);
        imageIds.add(R.drawable.card_45);
        imageIds.add(R.drawable.card_46);
        imageIds.add(R.drawable.card_47);
        imageIds.add(R.drawable.card_48);
        imageIds.add(R.drawable.card_49);
        imageIds.add(R.drawable.card_50);
        imageIds.add(R.drawable.card_51);
        imageIds.add(R.drawable.card_52);
}
    
    public PlayingCard(int suit, int rank) {
        super(suit, rank);
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


    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        String rank;
        if(this.rank == RANK_TWO) {
            rank = "Two";
        } else if (this.rank == RANK_THREE) {
            rank = "Three";
        } else if (this.rank == RANK_FOUR) {
            rank = "Four";
        } else if (this.rank == RANK_FIVE) {
            rank = "Five";
        } else if (this.rank == RANK_SIX) {
            rank = "Six";
        } else if (this.rank == RANK_SEVEN) {
            rank = "Seven";
        } else if (this.rank == RANK_EIGHT) {
            rank = "Eight";
        } else if (this.rank == RANK_NINE) {
            rank = "Nine";
        } else if (this.rank == RANK_TEN) {
            rank = "Ten";
        } else if (this.rank == RANK_JACK) {
            rank = "Jack";
        } else if (this.rank == RANK_QUEEN) {
            rank = "Queen";
        } else if (this.rank == RANK_KING) {
            rank = "King";
        } else if (this.rank == RANK_ACE) {
            rank = "Ace";
        } else {
            rank = "Something";
        }
        
        String suit;
        if (this.suit == SUIT_CLUB) {
            suit = "Clubs";
        } else if (this.suit == SUIT_DIAMOND) {
            suit = "Diamonds";
        } else if (this.suit == SUIT_HEART) {
            suit = "Hearts";
        } else if (this.suit == SUIT_SPADE) {
            suit = "Spades";
        } else {
            suit = "Something";
        }
        
        return rank + " of " + suit;
    }

    @Override
    public int compareTo(Card other) {
        int card = this.rank * 4 + this.suit;
        int otherCard = other.rank * 4 + other.suit;
        return card - otherCard;
    }
}
