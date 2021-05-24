package com.company;

public class Meniu {
    private static int COUNTER;

    private final int meniuId;
    private FelDeMancare[] optiuni; // nu array

    public Meniu(FelDeMancare[] optiuni) {
        this.optiuni = optiuni;
        meniuId = COUNTER;
        COUNTER++;
    }

    public FelDeMancare[] getOptiuni() {
        return optiuni;
    }

    public void setOptiuni(FelDeMancare[] optiuni) {
        this.optiuni = optiuni;
    }

    public int getMeniuId() {
        return meniuId;
    }
}
