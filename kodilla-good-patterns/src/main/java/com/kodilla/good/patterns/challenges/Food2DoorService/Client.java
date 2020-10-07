package com.kodilla.good.patterns.challenges.Food2DoorService;

public class Client {
    private String name;
    private String email;
    private int phone;

    public Client(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}
