package com.kodilla.good.patterns.food2door_13_4.Retailers;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;
import com.kodilla.good.patterns.food2door_13_4.OrderDto;
import com.kodilla.good.patterns.food2door_13_4.OrderProcessing;
import com.kodilla.good.patterns.food2door_13_4.Orders.GlutenFreeShopOrder;
import com.kodilla.good.patterns.food2door_13_4.RetailerOrderDecision;

public class GlutenFreeShop implements OrderProcessing {

    private RetailerOrderDecision retailerOrderDecision = new RetailerOrderDecision();
    private GlutenFreeShopOrder glutenFreeShopOrder = new GlutenFreeShopOrder();
    private ClientOrder clientOrder = glutenFreeShopOrder.order();

    @Override
    public OrderDto process() {
        retailerOrderDecision.isOrderAcceptedByRetailer(clientOrder);
        System.out.println("Order was received and will be send as soon as its collected\n~~~~~~~~~~");
        return new OrderDto(clientOrder,true);

    }
}
