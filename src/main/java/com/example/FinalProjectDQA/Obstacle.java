package com.example.FinalProjectDQA;

public class Obstacle extends Unit {
    /**
     * this class converts any attached unit to Obstacle
     */
    @Override
    public Unit convert () {
        return new Obstacle();
    }
}