package com.kodilla.good.patterns.challenges.Food2DoorService;

public class MailService implements InfoService {
    public boolean info(Client client){
        System.out.println("Dear "+client.getName()+", confirmation is sent at Your email address: "+client.getEmail()+"\n You made an order of product from: ");
        return true;
    }
}
