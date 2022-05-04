package com.example.FinalProjectDQA;
//some methods will be inherited from unit and can be removed. left as place holders for now.
public class Frog extends Unit
{
    /**
     * this class moves and locates frog objects.
     */
    private int[] Coordinates;
    private int xCoord;
    private int yCoord;
    private char unitVal;
    private final int unitNum = 2;

   public Unit convert(){
       return new Frog();
   }
}