package com.example.models;

import java.util.ArrayList;
import java.util.Random;

import com.example.simcards.R;

/**
 * This class represents a standard playing deck of 52 cards without jokers
 * @author Vishal
 */
public class PlayingDeck {
    
    protected ArrayList<Card> deck;
    
    /**
     * Constructs a standard playing deck of 52 cards without jokers
     */
    public PlayingDeck() {
        deck = new ArrayList<Card>(52);
        for(int i = 0; i < 13; i++) {
            for(int j = 0; j < 4; j++) {
                int index = i * 4 + j;
                PlayingCard card = new PlayingCard(PlayingCard.RANK_TWO + i, PlayingCard.SUIT_CLUB + i);
                card.setImageId(PlayingCard.imageIds.get(index));
                deck.add(card);
            }
        }
    }
    
    /**
     * Shuffles the deck once by randomly swapping elements
     */
    public void shuffle() {
        Random random = new Random(System.currentTimeMillis());
        for(int i = deck.size() - 1; i >= 0; i++) {
            int randomIndex = random.nextInt(i + 1);
            swap(i, randomIndex);
        }
    }
    
    /** 
     * Removes the top card from the deck.
     * @return the card removed from the top of the deck
     */
    public PlayingCard draw() {
        return (PlayingCard) deck.remove(deck.size() - 1);
    }
    
    public ArrayList<Hand> deal(int numHands) {
        ArrayList<Hand> hands = new ArrayList<Hand>();
        //construct each hand
        for(int i = 0; i < numHands; i++) {
            Hand hand = new Hand();
            hands.add(hand);
        }
        //deal out the deck
        for(int i = 0; !deck.isEmpty(); i++) {
            hands.get(i % numHands).addCard(this.draw());
        }
        return hands;
    }
    
    /**
     * Helper method used to shuffle cards.
     * @param index1 first element to be swapped
     * @param index2 second element to be swapped
     */
    private void swap(int index1, int index2) {
        PlayingCard temp = (PlayingCard) deck.get(index2);
        deck.set(index2, deck.get(index1));
        deck.set(index1, temp);
    }
    
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    
    

}
