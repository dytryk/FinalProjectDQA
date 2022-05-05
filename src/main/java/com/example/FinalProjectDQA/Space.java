package com.example.FinalProjectDQA;

public class Space extends Unit{
    /**
     * this class converts any attached unit to Space
     */
    @Override
    public Unit convert() {
        return new Space();
    }
}