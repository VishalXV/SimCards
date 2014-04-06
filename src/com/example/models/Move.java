package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Move implements Serializable {
    
    protected Player player;
    protected int moveType;
    protected ArrayList<Card> affectedCards;
    
    
    public Move(Player player, int moveType) {
        this.player = player;
        this.moveType = moveType;
        affectedCards = new ArrayList<Card>();
    }
    
    public int getMoveType() {
        return moveType;
    }
    
    public int getNumCards() {
        return affectedCards.size();
    }
    
    public void addCard(Card c) {
        affectedCards.add(c);
    }
    
    public ArrayList<Card> getCards() {
        return affectedCards;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    @Override
    public boolean equals(Object o) {
        Move other = (Move) o;
        boolean playerEquality = this.player.equals(other.player);
        boolean moveTypeEquality = this.moveType == other.moveType;
        boolean affectedCardsEquality = this.affectedCards.equals(other.affectedCards);
        return playerEquality && moveTypeEquality && affectedCardsEquality;
    }

}
