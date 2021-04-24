package com.company;

public class Sofer extends User{

    private String Masina;
    private double Salariu;

    public Sofer(String password, String email, String nume, String prenume, String masina, double salariu) {
        super(password, email, nume, prenume);
        Masina = masina;
        Salariu = salariu;
    }

    public String getMasina() {
        return Masina;
    }

    public void setMasina(String masina) {
        Masina = masina;
    }

    public double getSalariu() {
        return Salariu;
    }

    public void setSalariu(double salariu) {
        Salariu = salariu;
    }

    @Override
    public String toString() {
        return super.toString() + "Sofer{" +
                "Masina='" + Masina + '\'' +
                ", Salariu=" + Salariu +
                '}';
    }
}
