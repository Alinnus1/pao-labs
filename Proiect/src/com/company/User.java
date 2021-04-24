package com.company;

import javax.security.auth.login.AccountException;

abstract class User {

    private static int COUNTER;

    private String Password;
    private String Email;
    private String Nume;
    private String Prenume;
    private final int UserId;

    public User(String password, String email, String nume, String prenume) {
        Password = password;
        Email = email;
        Nume = nume;
        Prenume = prenume;
        UserId = COUNTER;
        COUNTER++;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }



    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    @Override
    public String toString() {
        return "User{" +
                "Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                '}';
    }
}
