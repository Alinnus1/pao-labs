package com.company;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComandaService {

    public void addFel (Comanda comanda,FelDeMancare fel){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("addFel",formatter.format(date));

        ArrayList<FelDeMancare> feluri = comanda.getFeluriDeMancare();
        feluri.add(fel);
        comanda.setFeluriDeMancare(feluri);


    }

    public void rmvFel (Comanda comanda,FelDeMancare fel){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("rmvFel",formatter.format(date));

        ArrayList<FelDeMancare> feluri = comanda.getFeluriDeMancare();
        feluri.remove(fel);
        comanda.setFeluriDeMancare(feluri);

    }
}
