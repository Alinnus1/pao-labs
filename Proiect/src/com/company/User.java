package com.company;

abstract class User {

    private static int COUNTER;

    private String password;
    private String email;
    private String nume;
    private String prenume;
    private final int userId;

    public User(String password, String email, String nume, String prenume) {
        this.password = password;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        userId = COUNTER;
        COUNTER++;
    }

    public User(int id,String password, String email, String nume, String prenume){
        this.userId = id;
        this.password = password;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }



    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "User{" +
                "Password='" + password + '\'' +
                ", Email='" + email + '\'' +
                ", Nume='" + nume + '\'' +
                ", Prenume='" + prenume + '\'' +
                '}';
    }
}
