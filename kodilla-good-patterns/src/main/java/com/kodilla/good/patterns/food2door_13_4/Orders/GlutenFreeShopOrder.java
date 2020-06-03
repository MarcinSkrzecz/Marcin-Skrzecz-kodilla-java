package com.kodilla.good.patterns.food2door_13_4.Orders;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;

public class GlutenFreeShopOrder {

    public ClientOrder order() {
        String retailer = "Gluten Free Shop";
        String productDescription = "Gluten free cookies 500g";
        int quantity = 20;

        return new ClientOrder(retailer, productDescription, quantity);
    }
}
