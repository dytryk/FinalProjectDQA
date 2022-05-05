package com.example.FinalProjectDQA;

public abstract class Unit {

    /**
     * this class moves and locates unit objects, and defines units as either a frog, space, obstacle
     */

    /**
     * converts a number to the corresponding character to display either frog, space, or obstacle
     *
     * @return char corresponding to user input for UI
     */
    public abstract Unit convert();

    /**
     * changes a Unit value to the corresponding char
     * @return char corresponding to unit type
     */
    public char toChar() {
        if (this.getClass().equals(Obstacle.class)){
            return 'X';
        }
        if (this.getClass().equals(Frog.class)){
            return 'O';
        }
            return ' ';
    }
}
