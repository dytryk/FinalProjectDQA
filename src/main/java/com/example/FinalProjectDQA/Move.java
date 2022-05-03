package com.example.FinalProjectDQA;

import java.util.Scanner;

public class Move {
    /**
     * This class takes user move input and converts it to coordinate changes for the frog
     */

    private char[] directions;
    private Scanner userIn = new Scanner(System.in);
    private boolean goodChar;
    private Exception badChar;
    /**
     * checks that character is valid for move
     * @param c the character submitted by the user
     * @return true, if the character is w, s, a, or d
     */
    private boolean isGoodChar(char c){
        //checks that user input is valid
        //TODO: finish
        return false;
    }

    /**
     * checks that the move location is not blocked or out of board bounds
     * @param c single value user input
     * @return true - if the location the user wants to move to is unobstructed and within bounds
     * </\p> false - if the location is off the board or an obstacle is in the way
     */
    private boolean validPlay(char c){
        //checks that move is not blocked or off of board
        //if off of board game ends
        //Todo: finish
        return false;
    }

    /**
     * returns the character move from user (Scanner)
     * @return user move
     */
    public char getMove(){
        // handles : input mismatch
        //TODO: finish
        return ' ';
    }
}
