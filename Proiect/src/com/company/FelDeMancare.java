package com.company;

public class FelDeMancare implements Comparable<FelDeMancare> {

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


    @Override
    public int compareTo(FelDeMancare o) {
        if(Pret == o.Pret)
            return 0;
        else if(Pret> o.Pret)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "FelDeMancare{" +
                "Nume='" + Nume + '\'' +
                ", Pret=" + Pret +
                '}';
    }
}
