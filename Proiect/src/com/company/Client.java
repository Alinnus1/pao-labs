package com.company;

import repository.AdresaUPS;

import java.util.ArrayList;


public class Client extends User{

    private Adresa adresa;
    private ArrayList<Comanda> comenzi;


    public Client(String password, String email, String nume, String prenume) {
        super(password, email, nume, prenume);
        adresa = new Adresa();
        comenzi = new ArrayList<Comanda>();
    }

    public Client(String password, String email, String nume, String prenume, com.company.Adresa adresa, ArrayList<Comanda> comenzi) {
        super(password, email, nume, prenume);
        this.adresa = adresa;
        this.comenzi = comenzi;
    }

    public Client(int id,String password, String email, String nume, String prenume, int adresaId){
        super(id,password,email,nume,prenume);
        this.adresa = AdresaUPS.getAdresaById(adresaId);

    }

    public com.company.Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(com.company.Adresa adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(ArrayList<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

//    public void adComanda(Comanda comanda){
//        Comenzi.add(comanda);

    @Override
    public String toString() {
        return super.toString() + "Client{" +
                "Adresa=" + adresa +
                ", Comenzi=" + comenzi +
                '}';
    }
//    }
}
