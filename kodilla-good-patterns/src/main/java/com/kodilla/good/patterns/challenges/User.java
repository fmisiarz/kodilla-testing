package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String street;
    private String mail;

    public User(String name, String street, String mail) {
        this.name = name;
        this.street = street;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getMail() {
        return mail;
    }
}
