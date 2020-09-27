package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class OrderFurniture implements OrderItem,OrderTime {
    final String orderName="Furniture";
    final LocalDate orderTime;

    public OrderFurniture(LocalDate orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String getOrderName() {
        return orderName;
    }

    @Override
    public LocalDate getOrderTime() {
        return orderTime.plusDays(13);
    }
}
