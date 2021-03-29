package com.company;

import java.util.ArrayList;

public class Client extends User{

    private Adresa Adresa;
    private ArrayList<Comanda> Comenzi;

    public Client(String password, String email, String nume, String prenume, com.company.Adresa adresa, ArrayList<Comanda> comenzi) {
        super(password, email, nume, prenume);
        Adresa = adresa;
        Comenzi = comenzi;
    }

    public com.company.Adresa getAdresa() {
        return Adresa;
    }

    public void setAdresa(com.company.Adresa adresa) {
        Adresa = adresa;
    }

    public ArrayList<Comanda> getComenzi() {
        return Comenzi;
    }

    public void setComenzi(ArrayList<Comanda> comenzi) {
        Comenzi = comenzi;
    }

//    public void adComanda(Comanda comanda){
//        Comenzi.add(comanda);

    @Override
    public String toString() {
        return "Client{" +
                "Adresa=" + Adresa +
                ", Comenzi=" + Comenzi +
                '}';
    }
//    }
}
