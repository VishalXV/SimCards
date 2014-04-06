package com.example.models;

import java.util.ArrayList;
import java.util.Stack;

public abstract class Game {

    protected ArrayList<Player> players;
    protected ArrayList<Pile> piles;
    protected Stack<Move> moves;
    protected PlayingDeck deck;
    protected int state;
    protected Player winner;
    
    public Game(int numPlayers, int state) {
        piles = new ArrayList<Pile>();
        moves = new Stack<Move>();
        deck = new PlayingDeck();
        ArrayList<Hand> hands = deck.deal(numPlayers);
        for(int i = 0; i < hands.size(); i++) {
            Player player = new Player(hands.get(i));
            players.add(player);
        }
        
    }
    
    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    public int getState() {
        return state;
    }
    
    public boolean validMove(Move move) {
        return validMove(move.getMoveType());
    }
    
    public abstract void processMove(Move move);

    public abstract boolean validMove(int moveType);
    
    public abstract boolean checkWinner(Player p);
    
    public boolean isDone() {
        return winner != null;
    }
    
    public Player getWinner() {
        return winner;
    }
    
    protected void transfer(ArrayList<Card> sourceCards, ArrayList<Card> destCards) {
        for(int i = 0; !sourceCards.isEmpty(); i++) {
            destCards.add(sourceCards.remove(sourceCards.size() - 1));
        }
    }
    
    protected void transfer(ArrayList<Card> sourceCards, Pile destination) {
        destination.addCards(sourceCards);
    }
    
    protected void transfer(Pile source, Player destination, int numCards) {
        destination.addCards(source.removeCards(numCards));
    }
    
    public boolean checkWinner(Move move) {
        return checkWinner(move.getPlayer());
    }
}
