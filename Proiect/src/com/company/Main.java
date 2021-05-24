package com.company;

import repository.*;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// ETAPA 1 DEMO:
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
//        ETAPA 2 DEMO:

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
//        SORT:
        Collections.sort(ListaFeluri, new Comparator<FelDeMancare>() {
            @Override
            public int compare(FelDeMancare o1, FelDeMancare o2) {
                if(o1.getPret()>o2.getPret()){
                    return 1;
                }
                if(o1.getPret()<o2.getPret()){
                    return -1;
                }
                return 0;
            }
        });
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


//        ETAPA NUMARUL 3 DEMO:


        AdresaUS adresaUS = new AdresaUS();
        SoferUS soferUS = new SoferUS();
        ClientUS clientUS = new ClientUS();
        FelDeMancareUS felUS = new FelDeMancareUS();

//        adresaUS.createTable();
//        adresaUS.addAdresa();
//        adresaUS.displayAdresa();
//
//        soferUS.createTable();
//        soferUS.addSofer();
//        soferUS.displaySofer();
//
//        clientUS.createTable();
//        clientUS.addClient();
//        clientUS.displayClient();
//
//        felUS.createTable();
//        felUS.addFel();
//        felUS.displayFel();

        FelDeMancareUPS felUPS = new FelDeMancareUPS();

//        felUPS.insertFel("Vita",32);
//        felUS.displayFel();
//        felUPS.updateFel("Vita",34,2);
//        felUS.displayFel();
//        FelDeMancare Vita = felUPS.getFelById(2);
//        System.out.println(Vita);
//        felUPS.deleteFel(2);
//        felUS.displayFel();

        AdresaUPS adresaUPS = new AdresaUPS();
//        adresaUPS.insertAdresa("Nae Nicu",3,"g8",2,1);
//        adresaUS.displayAdresa();
//        adresaUPS.updateAdresa("Nae Niculae",4,"g8",2,1,3);
//        adresaUS.displayAdresa();
//        Adresa nouAdresa = adresaUPS.getAdresaById(3);
//        System.out.println(nouAdresa);
//        adresaUPS.deleteAdresa(3);
//        adresaUS.displayAdresa();

//        ClientUPS clientUPS = new ClientUPS();
//        clientUPS.insertClient("123","testare","albert","ovidiu",1);
//        clientUS.displayClient();
//        clientUPS.updateClient("1234","testarea","albert","ovidiu",1,2);
//        clientUS.displayClient();
//        Client nouClient= clientUPS.getClientById(2);
//        System.out.println(nouClient);
//        clientUPS.deleteClient(2);
//        clientUS.displayClient();
//
//        System.out.println("---------------");
//        SoferUPS soferUPS = new SoferUPS();
//        soferUPS.insertSofer("123","testare","albert","ovidiu","renaul",2353.23);
//        soferUS.displaySofer();
//        soferUPS.updateSofer("1232","testaread","albert","ovidiu","renaul",5553.23,3);
//        soferUS.displaySofer();
//        Sofer nouSofer = soferUPS.getSoferById(3);
//        System.out.println(nouSofer);
//        soferUPS.deleteSofer(3);
//        soferUS.displaySofer();

    }
}
