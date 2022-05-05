package com.example.FinalProjectDQA;

import java.util.ArrayList;
import java.util.Random;

public class Terrain {
    /**
     * Terrain class generates the rows for Frogger with randomly placed obstacles
     */

    /**
     * this constructor initializes an arraylist of a set size
     */
    private ArrayList<Unit> row;

    public Terrain() {
        this.row = new ArrayList<>();
    }

    /**
     * this method populates a row with integer Units, filling up to a limited number of obstacles (1)
     *  and the rest of the units with open spaces (0)
     * @return arraylist of Units of type int
     */
    public ArrayList<Unit> generateTerr() {
        Random rand = new Random();
        int count = 0;
        Unit s = new Space();
        Unit o = new Obstacle();
        while (row.size() < 15) {
            int temp = rand.nextInt(3);
            if (temp == 2 && count < 6) {
                row.add(o.convert());
                count++;
            } else if (temp < 2 && count < 7) {
                row.add(s.convert());
            }
            if (row.size() == 15){
                break;
            }
            if (count == 6){
                row.add(s.convert());
            }
        }
        return row;
    }


    public ArrayList<Unit> emptyRow (){
        ArrayList<Unit> tEmpty = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            tEmpty.add(new Space());
        }
        return tEmpty;
    }
}