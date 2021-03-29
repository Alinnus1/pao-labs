package com.company;

abstract class Magazin {

    private static int COUNTER;


    private String Nume;
    private Adresa Adresa;
    private final int MagazinId;

    public Magazin(String nume, com.company.Adresa adresa) {
        Nume = nume;
        Adresa = adresa;
        MagazinId = COUNTER;
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

    public int getMagazinId() {
        return MagazinId;
    }
}
