package com.kodilla.good.patterns.food2door_13_4;

public class OrderProcessor {

    private OrderProcessing retailerOrderProcessing;

    public OrderProcessor(OrderProcessing retailerOrderProcessing) {
        this.retailerOrderProcessing = retailerOrderProcessing;
    }

    public OrderDto order() {
        return retailerOrderProcessing.process();
    }
}
