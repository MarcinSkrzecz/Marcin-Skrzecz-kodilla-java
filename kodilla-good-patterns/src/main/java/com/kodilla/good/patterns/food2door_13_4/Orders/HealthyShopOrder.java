package com.kodilla.good.patterns.food2door_13_4.Orders;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;

public class HealthyShopOrder {

    public ClientOrder order() {
        String retailer = "Healthy Shop";
        String productDescription = "Bio-Mango 200g";
        int quantity = 1;

        return new ClientOrder(retailer, productDescription, quantity);
    }
}