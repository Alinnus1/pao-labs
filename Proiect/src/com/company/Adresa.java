package com.company;

public class Adresa {

    private static int COUNTER;

    private int AdresaId;
    private String Strada;
    private int Numar;
    private String Bloc;
    private int Scara;
    private int Apartament;

    public Adresa(String strada, int numar, String bloc, int scara, int apartament) {
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
