package com.kodilla.good.patterns.food2door_13_4;

public class OrderDto {
    private ClientOrder clientOrder;
    private boolean isAcceptedByRetailer;

    public OrderDto(ClientOrder clientOrder, boolean isAcceptedByRetailer) {
        this.clientOrder = clientOrder;
        this.isAcceptedByRetailer = isAcceptedByRetailer;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public boolean isAcceptedByRetailer() {
        return isAcceptedByRetailer;
    }
}
