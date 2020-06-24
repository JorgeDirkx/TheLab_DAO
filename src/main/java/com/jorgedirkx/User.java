package com.jorgedirkx;

public class User {

    private String name;
    private String email;
    private int idNr;


    public User() {
    }

    public User(String name, String email, int idNr) {
        this.name = name;
        this.email = email;
        this.idNr = idNr;
    }

    public int getIdNr() {
        return idNr;
    }

    public void setIdNr(int idNr) {
        this.idNr = idNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", idNr=" + idNr +
                '}';
    }
}
