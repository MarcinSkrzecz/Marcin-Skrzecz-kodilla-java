package com.kodilla.good.patterns.shop_13_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, LocalDateTime whenBought, LocalDate estimatedDelivery) {
        System.out.println("Order Created");
    }
}
