package com.company;

public class Coin {
    private boolean face; // current side showing

    // default constructor
    public Coin(){
        flip();
    }

    // flip coin by randomly assigning
    public void flip(){
        face = ((int) (Math.random()*2) == 0);
    }

    // return true if current face is coin is head
    public boolean isHeads(){
        return face;
    }

    // return current face of coin as string
    public String toString(){
        return (face == true) ? "Heads" : "Tails";
    }
}
