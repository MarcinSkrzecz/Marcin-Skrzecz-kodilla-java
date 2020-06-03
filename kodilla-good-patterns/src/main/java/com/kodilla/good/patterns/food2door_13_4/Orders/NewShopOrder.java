package com.kodilla.good.patterns.food2door_13_4.Orders;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;

public class NewShopOrder {

    public ClientOrder order() {
        String retailer = "New Shop";
        String productDescription = "Lays Strong";
        int quantity = 100;

        return new ClientOrder(retailer, productDescription, quantity);
    }
}
