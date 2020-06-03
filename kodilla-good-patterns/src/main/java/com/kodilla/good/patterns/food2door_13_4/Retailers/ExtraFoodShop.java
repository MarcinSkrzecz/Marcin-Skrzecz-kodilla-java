package com.kodilla.good.patterns.food2door_13_4.Retailers;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;
import com.kodilla.good.patterns.food2door_13_4.OrderDto;
import com.kodilla.good.patterns.food2door_13_4.OrderProcessing;
import com.kodilla.good.patterns.food2door_13_4.Orders.ExtraFoodShopOrder;
import com.kodilla.good.patterns.food2door_13_4.RetailerOrderDecision;

public class ExtraFoodShop implements OrderProcessing {

    private RetailerOrderDecision retailerOrderDecision = new RetailerOrderDecision();
    private ExtraFoodShopOrder extraFoodShopOrder = new ExtraFoodShopOrder();
    private ClientOrder clientOrder = extraFoodShopOrder.order();

    @Override
    public OrderDto process() {
        int orderWeight = clientOrder.getWeight();

        if (clientOrder.getQuantity() > orderWeight) {
            System.out.println("~~~~~~~~~~" +
                    "\nRetailer: " + clientOrder.getRetailer() + " has declined Your order!" +
                    "\nOrder is too heavy and can't be send. Please remove something to have max 15kg." +
                    "\n~~~~~~~~~~");
            return new OrderDto(clientOrder, false);
        } else {
            retailerOrderDecision.isOrderAcceptedByRetailer(clientOrder);
            System.out.println("Order was received and will be send as soon as its collected\n~~~~~~~~~~");
            return new OrderDto(clientOrder, true);
        }
    }
}