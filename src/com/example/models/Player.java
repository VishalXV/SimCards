package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    
    private Hand hand;
    private int points;
    
    public Player() {
        this(new Hand());
    }
    
    public Player(Hand hand) {
        this.hand = hand;
        points = 0;
    }
    
    public void addCard(Card c) {
        hand.addCard(c);
    }
    
    public void addCards(ArrayList<Card> cards) {
        hand.addCards(cards);
    }
    
    public Card removeCard(int index) {
        return hand.removeCard(index);
    }
    
    public Card removeCard(Card card) {
        return hand.removeCard(card);
    }
    
    public int addPoints(int increment) {
        this.points += increment;
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    public Hand getHand(Hand hand) {
        return hand;
    }

}
