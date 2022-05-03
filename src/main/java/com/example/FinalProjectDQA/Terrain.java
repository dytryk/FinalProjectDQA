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
        Random r = new Random();
        int count = 0;
        Unit u = new Space(); // edit this
        while (row.size() < 15) {
            int temp = r.nextInt(2);
            if (temp == 1 && count < 8) {
                row.add(u.convert(temp));
                count++;
            } else if (temp == 0 && count < 9) {
                row.add(u.convert(temp));
            }
            if (row.size() == 15){
                break;
            }
            if (count == 7){
                row.add(u.convert(temp));
            }
        }
        System.out.println(row);
        return row;
    }

//    public void setFrog(int xCoord){
//        row.set(xCoord-1,new Frog());
//    }

    /**
     * this method converts the numbers into chars for viewable terrain
     * @param al an arraylist of Units of type int
     * @return an arraylist of Units of type char
     */
//    public ArrayList<Unit> materialize(ArrayList<Unit> al) {
//        //TODO: finish
//        return null;
//    }

    /**
     * @return a string containing a row of obstacles and spaces
     */
    @Override
    public String toString() {
        String rowStr = "";
        Unit o = new Obstacle();
        Unit s = new Space();
        for (int i = 0; i < row.size(); i++){
            if(row.get(i) == o) {
                rowStr = rowStr + "X";
            } else if (row.get(i) == s){
                rowStr = rowStr + " ";
            } else {
                rowStr = rowStr + "O";
            }
        }
        return rowStr;
    }
}
