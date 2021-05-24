package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Adresa {

    private static int COUNTER;

    private int adresaId;
    private String strada;
    private int numar;
    private String bloc;
    private int scara;
    private int apartament;

    public Adresa(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Adresa",formatter.format(date));

        strada = "";
        numar = 0;
        bloc = "";
        scara = 0;
        apartament = 0;
        adresaId = COUNTER;
        COUNTER++;
    }

    public Adresa(String strada, int numar, String bloc, int scara, int apartament) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Adresa",formatter.format(date));

        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.scara = scara;
        this.apartament = apartament;
        adresaId = COUNTER;
        COUNTER++;
    }

    public Adresa(int id,String strada, int numar, String bloc, int scara, int apartament){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Adresa",formatter.format(date));

        this.adresaId= id;
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.scara = scara;
        this.apartament = apartament;

    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public int getScara() {
        return scara;
    }

    public void setScara(int scara) {
        this.scara = scara;
    }

    public int getApartament() {
        return apartament;
    }

    public void setApartament(int apartament) {
        this.apartament = apartament;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "AdresaId=" + adresaId +
                ", Strada='" + strada + '\'' +
                ", Numar=" + numar +
                ", Bloc='" + bloc + '\'' +
                ", Scara=" + scara +
                ", Apartament=" + apartament +
                '}';
    }
}
