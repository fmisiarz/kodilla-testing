package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrdersService implements OrdersService {
    public boolean order(User user, LocalDateTime orderTime, LocalDateTime receiveTime,Order order) {
        System.out.println("User: "+user.getName()+". You ordered: "+order.getName()+"("+order.getQuantity()+") at date: "+orderTime+". You will receive it at: "+receiveTime);
        return true;
    }
}
