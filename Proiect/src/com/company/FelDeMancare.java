package com.company;

import java.util.Comparator;

public class FelDeMancare  {

    private static int COUNTER;

    private String nume;
    private int pret;
    private int felDeMancareId;

    public int getFelDeMancareId() {
        return felDeMancareId;
    }

    public FelDeMancare(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
        felDeMancareId = COUNTER;
        COUNTER++;

    }
    public FelDeMancare(int id,String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
        this.felDeMancareId = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }


//    @Override
//    public int compareTo(FelDeMancare o) {
//        if(pret == o.pret)
//            return 0;
//        else if(pret > o.pret)
//            return 1;
//        else
//            return -1;
//    }
//    @Override
//    public int compare(FelDeMancare o1, FelDeMancare o2){
//        if(o1.pret>o2.pret){
//            return 1;
//        }
//        if(o1.pret<o2.pret){
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public String toString() {
        return "FelDeMancare{" +
                "Nume='" + nume + '\'' +
                ", Pret=" + pret +
                '}';
    }
}
