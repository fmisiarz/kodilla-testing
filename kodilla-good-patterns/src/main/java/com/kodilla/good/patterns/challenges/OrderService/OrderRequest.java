package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class OrderRequest {
    final OrderConfirmation orderConfirmation;
    final OrderItem orderItem;
    final User user;
    final LocalDate orderTime;

    public OrderRequest(LocalDate orderTime, OrderConfirmation orderConfirmation, OrderItem orderItem, User user) {
        this.orderTime = orderTime;
        this.orderConfirmation = orderConfirmation;
        this.orderItem = orderItem;
        this.user = user;
    }
    public void communicate() {
        System.out.println("Hey " + user.getName() + "! You Ordered: " + orderItem.getOrderName() + ", at date: "
                + orderTime + " and You will receive it at: " + ". You will get confirmation via: " + orderConfirmation.getConfirmation());

    }}
