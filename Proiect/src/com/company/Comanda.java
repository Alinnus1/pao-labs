package com.company;

import java.util.ArrayList;

public class Comanda {

    private static int COUNTER;

    private final int ComandaId;
    private Restaurant Restaurant;
    private ArrayList<FelDeMancare> FeluriDeMancare;

    public Comanda(com.company.Restaurant restaurant, ArrayList<FelDeMancare> feluriDeMancare) {
        Restaurant = restaurant;
        FeluriDeMancare = feluriDeMancare;
        ComandaId = COUNTER;
        COUNTER++;

    }

    public static void setCOUNTER(int COUNTER) {
        Comanda.COUNTER = COUNTER;
    }

    public int getComandaId() {
        return ComandaId;
    }

    public com.company.Restaurant getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(com.company.Restaurant restaurant) {
        Restaurant = restaurant;
    }

    public ArrayList<FelDeMancare> getFeluriDeMancare() {
        return FeluriDeMancare;
    }

    public void setFeluriDeMancare(ArrayList<FelDeMancare> feluriDeMancare) {
        FeluriDeMancare = feluriDeMancare;
    }


    @Override
    public String toString() {
        return "Comanda{" +
                "ComandaId=" + ComandaId +
                ", Restaurant=" + Restaurant +
                ", FeluriDeMancare=" + FeluriDeMancare +
                '}';
    }
}
