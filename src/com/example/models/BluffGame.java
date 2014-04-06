package com.example.models;

import java.util.ArrayList;

public class BluffGame extends Game {

    public static final int STATE_START = 0;
    public static final int STATE_ROUND = 1;
    
    public Card trueCard;
    public Player starter;
    
    public BluffGame(int numPlayers) {
        super(numPlayers, STATE_START); //deal out the whole deck
        piles.add(new Pile());
    }

    @Override
    public void processMove(Move move) {
        //assume valid move
        int moveType = move.getMoveType();
        if (moveType == BluffMove.MOVE_BLUFF) {
            BluffMove pastMove = (BluffMove) moves.peek();
            if(pastMove.isBluff(trueCard)) {
                transfer(piles.get(0), pastMove.getPlayer(), pastMove.getNumCards());
            } else {
                transfer(piles.get(0), move.getPlayer(), pastMove.getNumCards());
            }
        } else if (moveType == BluffMove.MOVE_PLAY) {
            ArrayList<Card> cards = move.getCards();
            if(state == STATE_START) {
                trueCard = move.getCards().get(0);
                starter = move.getPlayer();
            }
            for (int i = 0; i < cards.size(); i++) {
                Card c = move.getPlayer().removeCard(cards.get(i));
                piles.get(0).addCard(c);
            }
        } else if(moveType == BluffMove.MOVE_PASS) {
            //do nothing
        }
        if(checkWinner(move)) {
            winner = move.getPlayer();
        }
        moves.add(move);
    }

    @Override
    public boolean validMove(int moveType) {
        if(state == STATE_START) {
            if(moveType == BluffMove.MOVE_BLUFF || moveType == BluffMove.MOVE_PASS) {
                return false;
            } else if (moveType == BluffMove.MOVE_PLAY) {
                return true;
            } else {
                return false;
            }
        } else if (state == STATE_ROUND) {
            if (moveType == BluffMove.MOVE_BLUFF || moveType == BluffMove.MOVE_PASS || moveType == BluffMove.MOVE_PLAY) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }
    
    public boolean checkWinner(Player p) {
        return p.getHand().isEmpty();
    }
    
    

    
}
