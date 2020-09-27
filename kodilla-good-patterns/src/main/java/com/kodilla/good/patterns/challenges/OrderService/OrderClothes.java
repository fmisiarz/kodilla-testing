package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class OrderClothes implements OrderItem,OrderTime{
    final String orderName="Clothes";
    final LocalDate orderTime;

    public OrderClothes(LocalDate orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public LocalDate getOrderTime() {
        return orderTime.plusDays(5);
    }

    @Override
    public String getOrderName() {
        return orderName;
    }
}
