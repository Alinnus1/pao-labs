package com.company;

public class FelDeMancare {

    private static int COUNTER;

    private String Nume;
    private int Pret;
    private int FelDeMancareId;

    public FelDeMancare(String nume, int pret) {
        Nume = nume;
        Pret = pret;
        FelDeMancareId = COUNTER;
        COUNTER++;

    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public int getPret() {
        return Pret;
    }

    public void setPret(int pret) {
        Pret = pret;
    }
}
