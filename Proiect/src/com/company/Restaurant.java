package com.company;

public class Restaurant {

    private static int COUNTER;

    private final int RestaurantId;
    private String nume;
    private Adresa adresa;
    private Meniu meniu;

    public Restaurant(String nume, com.company.Adresa adresa, com.company.Meniu meniu) {
        this.nume = nume;
        this.adresa = adresa;
        RestaurantId = COUNTER;
        this.meniu = meniu;
        COUNTER++;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public com.company.Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(com.company.Adresa adresa) {
        this.adresa = adresa;
    }

    public com.company.Meniu getMeniu() {
        return meniu;
    }

//    public void setMeniu(com.company.Meniu meniu) {
//        Meniu = meniu;
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "RestaurantId=" + RestaurantId +
                ", Nume='" + nume + '\'' +
                ", Adresa=" + adresa +
                ", Meniu=" + meniu +
                '}';
    }
}
