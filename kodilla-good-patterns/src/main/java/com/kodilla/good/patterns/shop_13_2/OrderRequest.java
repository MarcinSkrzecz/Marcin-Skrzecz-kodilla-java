package com.kodilla.good.patterns.shop_13_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime whenBought;
    private LocalDate estimatedDelivery;

    protected OrderRequest(User user, LocalDateTime whenBought, LocalDate estimatedDelivery) {
        this.user = user;
        this.whenBought = whenBought;
        this.estimatedDelivery = estimatedDelivery;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getWhenBought() {
        return whenBought;
    }

    public LocalDate getEstimatedDelivery() {
        return estimatedDelivery;
    }
}