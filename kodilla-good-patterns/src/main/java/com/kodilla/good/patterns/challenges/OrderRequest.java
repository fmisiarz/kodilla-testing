package com.kodilla.good.patterns.challenges;


import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    private LocalDateTime receiveTime;
    private Order order;
    public OrderRequest(User user, LocalDateTime orderTime, LocalDateTime receiveTime, Order order){
        this.user=user;
        this.orderTime=orderTime;
        this.receiveTime=receiveTime;
        this.order=order;
    }
    public User getUser() {
        return user;
    }
public Order getOrder(){
        return order;
}
    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }
}
