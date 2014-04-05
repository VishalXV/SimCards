package com.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class Pile {

    Stack<Card> pile;
    
    public Pile() {
        pile = new Stack<Card>();
    }
    
    /**
     * Push a card to the top of the pile
     * @param c the card to be added to the top of the pile
     */
    public void addCard(Card c) {
        pile.add(c);
    }
    /**
     * Pop a card off of the top of the pile
     * @return the card on top of the pile
     */
    public Card removeCard() {
        return pile.pop();
    }
    /**
     * Pop a number of cards off the top of the pile
     * @return an ArrayList of the removed cards
     */
    public ArrayList<Card> removeCards(int numCards) {
        if(numCards > pile.size()) {
            numCards = pile.size();
        }
        ArrayList<Card> removedCards = new ArrayList<Card>();
        for(int i = 0; i < numCards; i++) {
            removedCards.add(pile.pop());
        }
        return removedCards;
    }
    
    public void addCards(ArrayList<Card> cards) {
        for(int i = 0; !cards.isEmpty(); i++) {
            pile.push(cards.remove(0));
        }
    }
    
}
