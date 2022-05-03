package com.example.FinalProjectDQA;

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

        Terrain t = new Terrain();
        for (int i = 0; i < 100; i++) {
            t.generateTerr();
        }
    }
}