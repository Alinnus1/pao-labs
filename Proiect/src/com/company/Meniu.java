package com.company;

import java.util.ArrayList;

public class Meniu {
    private static int COUNTER;

    private final int MeniuId;
    private FelDeMancare[] Optiuni; // nu array

    public Meniu(FelDeMancare[] optiuni) {
        Optiuni = optiuni;
        MeniuId = COUNTER;
        COUNTER++;
    }

    public FelDeMancare[] getOptiuni() {
        return Optiuni;
    }

    public void setOptiuni(FelDeMancare[] optiuni) {
        Optiuni = optiuni;
    }

    public int getMeniuId() {
        return MeniuId;
    }
}
