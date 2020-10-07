package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrdersService {
    boolean order(User user, LocalDateTime orderTime, LocalDateTime receiveTime,Order order);
}
