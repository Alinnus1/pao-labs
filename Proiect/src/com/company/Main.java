package com.company;

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

    }
}
