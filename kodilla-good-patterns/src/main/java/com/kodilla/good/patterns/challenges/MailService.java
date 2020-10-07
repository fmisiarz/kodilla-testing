package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{
    public void inform(User user){
        System.out.println("SENDING CONFIRMATION VIA MAIL TO: "+user.getMail());
    }
}
