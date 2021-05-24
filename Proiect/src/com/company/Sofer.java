package com.company;

public class Sofer extends User{

    private String masina;
    private double salariu;

    public Sofer(String password, String email, String nume, String prenume, String masina, double salariu) {
        super(password, email, nume, prenume);
        this.masina = masina;
        this.salariu = salariu;
    }

    public Sofer(int id ,String password, String email, String nume, String prenume,String masina, double salariu) {
        super(id,password,email,nume,prenume);
        this.masina = masina;
        this.salariu = salariu;
    }

    public String getMasina() {
        return masina;
    }

    public void setMasina(String masina) {
        this.masina = masina;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return super.toString() + "Sofer{" +
                "Masina='" + masina + '\'' +
                ", Salariu=" + salariu +
                '}';
    }
}
