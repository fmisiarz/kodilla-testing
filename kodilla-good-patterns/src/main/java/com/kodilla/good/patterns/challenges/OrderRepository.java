package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime orderTime, LocalDateTime receiveTime,Order order);
}
