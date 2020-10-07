package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user1=new User("Filip","wiadoma","hotmail@o2.pl");
        LocalDateTime orderTime= LocalDateTime.of(2020,10,2,12,45,23);
        LocalDateTime receiveTime=orderTime.plusDays(5);
        Order order=new Order("Kocyk",2.55,2);
        return new OrderRequest(user1,orderTime,receiveTime,order);
    }
}
