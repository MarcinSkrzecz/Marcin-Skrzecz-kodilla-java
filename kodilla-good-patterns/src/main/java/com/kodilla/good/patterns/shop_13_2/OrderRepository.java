package com.kodilla.good.patterns.shop_13_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderRepository {
    public void createOrder(User user, LocalDateTime whenBought, LocalDate estimatedDelivery);
}
