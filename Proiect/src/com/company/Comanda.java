package com.company;

import java.util.ArrayList;

public class Comanda {

    private static int COUNTER;

    private final int comandaId;
    private Restaurant restaurant;
    private ArrayList<FelDeMancare> feluriDeMancare;
    //private pret total

    public Comanda(com.company.Restaurant restaurant, ArrayList<FelDeMancare> feluriDeMancare) {
        this.restaurant = restaurant;
        this.feluriDeMancare = feluriDeMancare;
        comandaId = COUNTER;
        COUNTER++;

    }

    public static void setCOUNTER(int COUNTER) {
        Comanda.COUNTER = COUNTER;
    }

    public int getComandaId() {
        return comandaId;
    }

    public com.company.Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(com.company.Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<FelDeMancare> getFeluriDeMancare() {
        return feluriDeMancare;
    }

    public void setFeluriDeMancare(ArrayList<FelDeMancare> feluriDeMancare) {
        this.feluriDeMancare = feluriDeMancare;
    }


    @Override
    public String toString() {
        return "Comanda{" +
                "ComandaId=" + comandaId +
                ", Restaurant=" + restaurant +
                ", FeluriDeMancare=" + feluriDeMancare +
                '}';
    }
}
