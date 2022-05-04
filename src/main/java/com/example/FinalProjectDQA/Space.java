package com.example.FinalProjectDQA;

public class Space extends Unit{
    /**
     * this class moves and locates Space objects.
     */
    //some methods will be inherited from unit and can be removed. left as placeholders for now.
    private int[] Coordinates;
   // private int xCoord;
    //private int yCoord;
    private char unitVal;
    private final int unitNum = 0;

    /**
     * sets coordinates of frog from system input
     * @param x sets x coordinate
     * @param y sets x coordinate
     */
    //public void setCoords(int x, int y){
        //TODO: finish
    //}
    /**
     * returns an array of length 2 with x and y coordinates for space
     * @return
     */
   /* public int[] getCoords(){
        int[] temp = new int[0];
        //TODO: finish
        return temp;
    }
*/
    @Override
    public Unit convert(int num) {
        return new Space();
    }
}