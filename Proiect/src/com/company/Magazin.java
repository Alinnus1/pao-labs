package com.company;

abstract class Magazin {

    private static int COUNTER;


    private String nume;
    private Adresa adresa;
    private final int magazinId;

    public Magazin(String nume, com.company.Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        magazinId = COUNTER;
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

    public int getMagazinId() {
        return magazinId;
    }
}
