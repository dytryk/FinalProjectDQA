package com.example.FinalProjectDQA;

public class Obstacle extends Unit{
    /**
     * this class moves and locates obstacle objects.
     */

    //some methods will be inherited from unit and can be removed. left as place holders for now.
    private final int unitNum = 1;
//    private int[] Coordinates;
//    private int xCoord;
//    private int yCoord;
//    private char unitVal;

    public Unit convert (int num) {
        return new Obstacle();
    }
///**
// * sets coordinates of frog from system input
// * @param x sets x coordinate
// * @param y sets x coordinate
// */
//    public void setCoords(int x, int y){
//        this.xCoord = x;
//        this.yCoord = y;
//    }
//    /**
//     * returns the x and y coordinates of the obstacle
//     * @return an array of length 2 with x and y coordinates for obstacle
//     */
//    public int[] getCoords(){
//        int[] temp = new int[0];
//        //TODO: finish
//        return temp;
//    }
}
