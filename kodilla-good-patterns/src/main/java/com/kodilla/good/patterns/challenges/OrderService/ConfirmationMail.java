package com.kodilla.good.patterns.challenges.OrderService;

public class ConfirmationMail implements OrderConfirmation{
    private String confirmation="MAIL";

    @Override
    public String getConfirmation() {
        return confirmation;
    }

    @Override
    public String toString() {
        return getConfirmation();
    }
}
