package com.kodilla.good.patterns.food2door_13_4.Retailers;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;
import com.kodilla.good.patterns.food2door_13_4.OrderDto;
import com.kodilla.good.patterns.food2door_13_4.OrderProcessing;
import com.kodilla.good.patterns.food2door_13_4.Orders.HealthyShopOrder;
import com.kodilla.good.patterns.food2door_13_4.RetailerOrderDecision;

public class HealthyShop implements OrderProcessing {

    private RetailerOrderDecision retailerOrderDecision = new RetailerOrderDecision();
    private HealthyShopOrder healthyShopOrder = new HealthyShopOrder();
    private ClientOrder clientOrder = healthyShopOrder.order();

    @Override
    public OrderDto process() {
        boolean retailerDecision = retailerOrderDecision.isOrderAcceptedByRetailer(clientOrder);

        if (retailerDecision) {
            System.out.println("Order was accepted");
            return new OrderDto(clientOrder, true);
        } else {
            System.out.println("Order was declined");
            return new OrderDto(clientOrder, false);
        }
    }
}
