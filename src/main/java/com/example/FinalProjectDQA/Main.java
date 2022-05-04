package com.example.FinalProjectDQA;

import java.util.ArrayList;

public class Main
{
    /**
     * This class plays Frogger
     */

    /**
     * This method runs a game of Frogger and counts the number of rows moved forward as score
     * @param args
     */
    public static void main(String[] args)
    {
        //TODO: Do stuff

        for (int i = 0; i < 25; i++) {
            Terrain t = new Terrain();
            t.generateTerr();
            t.toString();
        }
    }
}