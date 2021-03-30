package com.company;

import java.util.ArrayList;

public class ComandaService {

    public void addFel (Comanda comanda,FelDeMancare fel){
        ArrayList<FelDeMancare> feluri = comanda.getFeluriDeMancare();
        feluri.add(fel);
        comanda.setFeluriDeMancare(feluri);
    }

    public void rmvFel (Comanda comanda,FelDeMancare fel){
        ArrayList<FelDeMancare> feluri = comanda.getFeluriDeMancare();
        feluri.remove(fel);
        comanda.setFeluriDeMancare(feluri);

    }
}
