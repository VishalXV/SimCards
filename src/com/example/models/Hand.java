package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Hand implements Serializable {

    ArrayList<Card> hand;
    
    public Hand() {
        hand = new ArrayList<Card>();
    }
    
    public void addCard(Card c) {
        hand.add(c);
    }
    
    public void addCards(ArrayList<Card> cards) {
        for(int i = 0; !cards.isEmpty(); i++) {
            hand.add(cards.remove(0));
        }
    }
    
    public Card removeCard(int index) {
        return hand.remove(index);
    }
    
    public Card removeCard(Card c) {
        for(int i = 0; i < hand.size(); i++) {
            if(c.equals(hand.get(i))) {
                return hand.remove(i);
            }
        }
        throw new IllegalArgumentException();
    }
    public boolean isEmpty() {
        return hand.isEmpty();
    }
    public boolean equals(Object o) {
        Hand other = (Hand) o;
        return hand.equals(other.hand);
    }
    public ArrayList<Card> getArrayList(){
    	return this.hand;
    }

}
