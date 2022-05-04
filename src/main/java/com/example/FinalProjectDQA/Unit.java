package com.example.FinalProjectDQA;

public abstract class Unit {

    /**
     * this class moves and locates unit objects, and defines units as either a frog, space, obstacle
     */
    private int[] Coordinates;
    private int xCoord;
    private int yCoord;
    private char unitVal;
    private int unitNum;

    /**
     * sets the location of a specific "unit" in the array.
     *
     * @param x coordinate
     * @param y coordinate
     */
    public void setCoords(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    /**
     * get the x and y coordinates of an object of type unit
     *
     * @return array with x and y values for a unit
     */
    public int[] getCoords() {
        int[] coords = new int[2];
        coords[0] = xCoord;
        coords[1] = yCoord;
        return coords;
    }

    /**
     * sets int value for unitNum
     *
     * @param num input from user
     */
    public void setNum(int num) {
        unitNum = num;
    }
    public int getNum(){return unitNum;}

    /**
     * converts a number to the corresponding character to display either frog, space, or obstacle
     *
     * @return char corresponding to user input for UI
     */
    public abstract Unit convert();

    /**
     * reverts a char value back to the corresponding int
     *
     * @param val char to be converted to an int
     * @return int corresponding to user input
     */
    public int toChar(char val) {
        int revertion = 0;
        if (val == 'X') {
            revertion = 1;
        }
        if (val == 'O') {
            revertion = 2;
        }
        return revertion;
    }
}
