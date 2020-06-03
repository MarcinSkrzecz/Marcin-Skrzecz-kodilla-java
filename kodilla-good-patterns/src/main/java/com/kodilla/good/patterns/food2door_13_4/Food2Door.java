package com.kodilla.good.patterns.food2door_13_4;

import com.kodilla.good.patterns.food2door_13_4.Retailers.ExtraFoodShop;
import com.kodilla.good.patterns.food2door_13_4.Retailers.GlutenFreeShop;
import com.kodilla.good.patterns.food2door_13_4.Retailers.HealthyShop;
import com.kodilla.good.patterns.food2door_13_4.Retailers.NewShop;

public class Food2Door {
    public static void main(String[] args) {

        OrderProcessor orderProcessorHS = new OrderProcessor(new HealthyShop());
        orderProcessorHS.order();

        OrderProcessor orderProcessorGFS = new OrderProcessor(new GlutenFreeShop());
        orderProcessorGFS.order();

        OrderProcessor orderProcessorEFS = new OrderProcessor(new ExtraFoodShop());
        orderProcessorEFS.order();

        OrderProcessor orderProcessorNS = new OrderProcessor(new NewShop());
        orderProcessorNS.order();
    }
}


