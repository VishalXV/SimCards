package com.example.models;

public class PlayingCard extends Card {
    
    /**
     * Suit constants
     */
    public static final int SUIT_CLUB = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_HEART = 3;
    public static final int SUIT_SPADE = 4;
    
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
