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

//    public void setFrog(int xCoord){
//        row.set(xCoord-1,new Frog());
//    }

//    /**
//     * this method converts the numbers into chars for viewable terrain
//     * @param al an arraylist of Units of type int
//     * @return an arraylist of Units of type char
//     */
//    public ArrayList<Unit> materialize(ArrayList<Unit> al) {
//        //TODO: finish
//        return null;
//    }
    public ArrayList<Unit> emptyRow (){
        ArrayList<Unit> tEmpty = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            tEmpty.add(new Space());
        }
        return tEmpty;
    }

    /**
     * @return a string containing a row of obstacles and spaces
     */
    @Override
    public String toString() {
        String rowStr = "";
        Unit o = new Obstacle();
        Unit s = new Space();
        for (int i = 0; i < row.size(); i++){
            if((row.get(i).getClass()).equals(o.getClass())){
                rowStr = rowStr + "X";
            } else if ((row.get(i).getClass()).equals(s.getClass())){
                rowStr = rowStr + " ";
            } else {
                rowStr = rowStr + "O";
            }
        }
        return rowStr;
    }
}
