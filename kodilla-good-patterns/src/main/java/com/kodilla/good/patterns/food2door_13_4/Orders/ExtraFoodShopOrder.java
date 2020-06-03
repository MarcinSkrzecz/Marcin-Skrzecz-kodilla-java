package com.kodilla.good.patterns.food2door_13_4.Orders;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;

public class ExtraFoodShopOrder {

    public ClientOrder order() {
        String retailer = "Extra Food Shop";
        String productDescription = "Extra shrimps 1000g";
        int quantity = 20;
        int weight = 20000;

        return new ClientOrder(retailer, productDescription, quantity);
    }
}
