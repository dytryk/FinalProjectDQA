package com.example.FinalProjectDQA;

public class Frog extends Unit {
    /**
     * this class converts any attached unit to Frog
     */
    @Override
   public Unit convert(){
       return new Frog();
   }
}