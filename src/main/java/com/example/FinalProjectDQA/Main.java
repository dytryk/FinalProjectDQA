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

        for (int i = 0; i < 100; i++) {
            Terrain t = new Terrain();
            t.generateTerr();
            System.out.println(t.toString());
        }
    }
}