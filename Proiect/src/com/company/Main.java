package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// de aici facem apelul catre clasa serviciu
        Adresa a1 = new Adresa("Ana",23,"d2", 23, 20);
        Client c1 = new Client("ha", "a@a","al", "in", a1,new ArrayList<Comanda>());
        FelDeMancare f = new FelDeMancare( "Carne quatro formagi", 20);
        FelDeMancare[] fs = new FelDeMancare[1];
        fs[0] = f;
        ArrayList<FelDeMancare> afs = new ArrayList<FelDeMancare>(Arrays.asList(fs));
        Meniu m1 = new Meniu(fs);
        Restaurant r1 = new Restaurant("Pep&Pepper",a1,m1);
        Comanda cm1 = new Comanda(r1,afs);


        System.out.println(a1);
        System.out.println(c1);
        System.out.println(cm1);
        ClientService cs = new ClientService();
        cs.addComanda(c1,cm1);
        System.out.println(c1);

        cs.readCSV("D:\\Facultate an2 sem2\\PAO\\pao-labs\\pao-labs\\Proiect\\csvs\\Clients.csv");

        FelDeMancareService fss = new FelDeMancareService();
        AdresaService as = new AdresaService();
        SoferService ss = new SoferService();
        ArrayList<Adresa> ListaAdrese = new ArrayList<Adresa>();
        ListaAdrese = as.readCSV("D:\\Facultate an2 sem2\\PAO\\pao-labs\\pao-labs\\Proiect\\csvs\\Adreses.csv");
        for (Adresa i:
             ListaAdrese) {
            System.out.println(i);

        }
        ArrayList<FelDeMancare> ListaFeluri = new ArrayList<FelDeMancare>();
        ListaFeluri = fss.readCSV("D:\\Facultate an2 sem2\\PAO\\pao-labs\\pao-labs\\Proiect\\csvs\\FelDeMancares.csv");
        for (FelDeMancare i :
                ListaFeluri) {
            System.out.println(i);
        }
        ArrayList<Sofer> ListaSoferi = new ArrayList<Sofer>();
        ListaSoferi = ss.readCSV("D:\\Facultate an2 sem2\\PAO\\pao-labs\\pao-labs\\Proiect\\csvs\\Sofers.csv");
        for (Sofer i :
                ListaSoferi) {
            System.out.println(i);
        }
        ArrayList<Client> ListaClienti = new ArrayList<Client>();
        ListaClienti = cs.readCSV("D:\\Facultate an2 sem2\\PAO\\pao-labs\\pao-labs\\Proiect\\csvs\\Clients.csv");
        for (Client i :
                ListaClienti) {
            System.out.println(i);
        }
        as.writeCSV("D:\\Facultate an2 sem2\\PAO\\pao-labs\\pao-labs\\Proiect\\csvs\\Adreses1.csv",ListaAdrese);


    }
}
