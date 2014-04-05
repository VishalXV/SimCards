package com.example.models;

public class BluffMove extends Move {

    public static final int MOVE_PLAY = 0;
    public static final int MOVE_PASS = 1;
    public static final int MOVE_BLUFF = 2;
    
    public BluffMove(Player player, int moveType) {
        super(player, moveType);
    }
    
    public boolean isBluff(Card trueCard) {
        for(Card c : affectedCards) {
            if(!c.equals(trueCard)) {
                return true;
            }
        }
        return false;
    }

}
