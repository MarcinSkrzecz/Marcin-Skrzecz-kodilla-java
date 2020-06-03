package com.kodilla.good.patterns.food2door_13_4;

public class RetailerOrderDecision {

    public boolean isOrderAcceptedByRetailer(ClientOrder clientOrder) {
        System.out.println("~~~~~~~~~~\nRetailer: " + clientOrder.getRetailer() + " has accepted Client order.\nOrdered: \n"
        + clientOrder.getQuantity() + " - " + clientOrder.getProductDescription());
        return true;
    }
}