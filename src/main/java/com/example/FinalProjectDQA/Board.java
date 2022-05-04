package com.example.FinalProjectDQA;

import java.util.ArrayList;
import java.util.LinkedList;

public class Board {
    /**
     * This class holds the board to display
     */
    private LinkedList<ArrayList<Unit>> board;
    private final int NUM_ROWS = 12;
    private Frog timmy;
    private int score;
    private int moveCount;

    /**
     * this constructor initializes the linkedlist display for Frogger
     */
    public Board(){
        //sets num rows
        board = new LinkedList<ArrayList<Unit>>();
        score = 0;
        moveCount = 0;
    }

    /**
     * this method populates the board with rows of obstacles and columns
     *  and starts the frog in the middle of the third visible row
     * @return grid of populated rows
     */
    public void generateFirstBoard(){
//        Populates list with arraylists
//        Places Frog in an available space on row 2
        // finish
        for (int i = 0; i < NUM_ROWS; i++){
            addRow();
        }
        setFrog(8,3);
    }

    public void setFrog(int xCoord, int yCoord){
        //TODO: See Move.java, ONLY MOVE to new position if unit is not obstacle
//        Terrain fRow = board.get(yCoord);
        board.get(yCoord).set(xCoord,new Frog());
        timmy.setCoords(8,3);
    }

    /**
     * this method generates boards past the first
     * @return
     */
    public void generateBoard() {
        //TODO: finish
        moveCount++;
        if (moveCount%2 == 0){
            board.removeFirst();
            addRow();
        }
    }

    /**
     * removes a row from the bottom of the display
     * @return display minus the bottom row
     */
    public void removeRow(){
        //Occurs at the same time as addRow
        //Have check for frog and count num rows removed.
        //TODO: finish
        int[] frogLoc = timmy.getCoords();

    }

    /**
     * adds a row to the top of the display
     */
    public void addRow(){
        //TODO: finish
        Terrain t = new Terrain();
        board.add(t.generateTerr());
    }
}
