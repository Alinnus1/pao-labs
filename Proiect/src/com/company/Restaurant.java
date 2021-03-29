package com.company;

import java.util.ArrayList;

public class Restaurant {

    private static int COUNTER;

    private final int RestaurantId;
    private String Nume;
    private Adresa Adresa;
    private Meniu Meniu;

    public Restaurant(String nume, com.company.Adresa adresa, com.company.Meniu meniu) {
        Nume = nume;
        Adresa = adresa;
        RestaurantId = COUNTER;
        Meniu = meniu;
        COUNTER++;

    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public com.company.Adresa getAdresa() {
        return Adresa;
    }

    public void setAdresa(com.company.Adresa adresa) {
        Adresa = adresa;
    }

    public com.company.Meniu getMeniu() {
        return Meniu;
    }

//    public void setMeniu(com.company.Meniu meniu) {
//        Meniu = meniu;
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "RestaurantId=" + RestaurantId +
                ", Nume='" + Nume + '\'' +
                ", Adresa=" + Adresa +
                ", Meniu=" + Meniu +
                '}';
    }
}
