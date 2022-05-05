package com.example.FinalProjectDQA;

public abstract class Unit {
    /**
     * this class defines units as either a frog, space, or obstacle
     */

    /**
     * converts a number to the corresponding character to display either frog, space, or obstacle
     * @return char corresponding to user input for UI
     */
    public abstract Unit convert();
}