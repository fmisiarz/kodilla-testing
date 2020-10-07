package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderBaseRepo implements OrderRepository{
    public void createOrder(User user, LocalDateTime orderTime,LocalDateTime receiveTime,Order order){
        System.out.println("Order: "+order.getName()+" created for user: "+user.getName()+" at time: "+orderTime+". Receive date: "+receiveTime);
    }
}
