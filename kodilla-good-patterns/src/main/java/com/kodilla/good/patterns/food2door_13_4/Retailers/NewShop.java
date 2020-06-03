package com.kodilla.good.patterns.food2door_13_4.Retailers;

import com.kodilla.good.patterns.food2door_13_4.ClientOrder;
import com.kodilla.good.patterns.food2door_13_4.OrderDto;
import com.kodilla.good.patterns.food2door_13_4.OrderProcessing;
import com.kodilla.good.patterns.food2door_13_4.Orders.NewShopOrder;
import com.kodilla.good.patterns.food2door_13_4.RetailerOrderDecision;

public class NewShop implements OrderProcessing {

    private RetailerOrderDecision retailerOrderDecision = new RetailerOrderDecision();
    private NewShopOrder newShopOrder = new NewShopOrder();
    private ClientOrder clientOrder = newShopOrder.order();

    @Override
    public OrderDto process() {
        int quantity = clientOrder.getQuantity();

        if (quantity > 25) {
            System.out.println("~~~~~~~~~~" +
                    "\nRetailer: " + clientOrder.getRetailer() + " has declined Your order!" +
                    "\nYou have ordered too much products. Maximum is 25 products per order" +
                    "\n~~~~~~~~~~");
            return new OrderDto(clientOrder, false);
        } else {
            retailerOrderDecision.isOrderAcceptedByRetailer(clientOrder);
            System.out.println("Order was received and will be send as soon as its collected\n~~~~~~~~~~");
            return new OrderDto(clientOrder, true);
        }
    }
}