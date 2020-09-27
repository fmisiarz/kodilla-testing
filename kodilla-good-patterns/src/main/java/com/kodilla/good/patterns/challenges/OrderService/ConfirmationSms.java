package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class ConfirmationSms implements OrderConfirmation{
    private String confirmation="SMS";

    @Override
    public String getConfirmation() {
        return confirmation;
    }

    @Override
    public String toString() {
        return getConfirmation();
    }
}
