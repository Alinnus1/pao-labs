package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Adresa {

    private static int COUNTER;

    private int AdresaId;
    private String Strada;
    private int Numar;
    private String Bloc;
    private int Scara;
    private int Apartament;

    public Adresa(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Adresa",formatter.format(date));

        Strada = "";
        Numar = 0;
        Bloc = "";
        Scara = 0;
        Apartament = 0;
        AdresaId = COUNTER;
        COUNTER++;
    }

    public Adresa(String strada, int numar, String bloc, int scara, int apartament) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Adresa",formatter.format(date));

        Strada = strada;
        Numar = numar;
        Bloc = bloc;
        Scara = scara;
        Apartament = apartament;
        AdresaId = COUNTER;
        COUNTER++;
    }

    public int getNumar() {
        return Numar;
    }

    public void setNumar(int numar) {
        Numar = numar;
    }

    public String getBloc() {
        return Bloc;
    }

    public void setBloc(String bloc) {
        Bloc = bloc;
    }

    public int getScara() {
        return Scara;
    }

    public void setScara(int scara) {
        Scara = scara;
    }

    public int getApartament() {
        return Apartament;
    }

    public void setApartament(int apartament) {
        Apartament = apartament;
    }

    public String getStrada() {
        return Strada;
    }

    public void setStrada(String strada) {
        Strada = strada;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "AdresaId=" + AdresaId +
                ", Strada='" + Strada + '\'' +
                ", Numar=" + Numar +
                ", Bloc='" + Bloc + '\'' +
                ", Scara=" + Scara +
                ", Apartament=" + Apartament +
                '}';
    }
}
