package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.decorators.*;
import com.kodilla.patterns2.decorator.pizza.doe.Basic;
import com.kodilla.patterns2.decorator.pizza.doe.BasicWIthCheeseStuffedCrust;
import com.kodilla.patterns2.decorator.pizza.doe.Double;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new Basic();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new Basic();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza doe", description);
    }

    @Test
    public void testDoubleDoePizzaWithStuffGetCost() {
        //Given
        PizzaOrder theOrder = new Double();
        theOrder = new Bellpepper(theOrder);
        theOrder = new BlackOlives(theOrder);
        theOrder = new Cheese(theOrder);
        theOrder = new GreenOlives(theOrder);
        theOrder = new Ham(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testDoubleDoePizzaWithStuffGetDescription() {
        //Given
        PizzaOrder theOrder = new Double();
        theOrder = new Bellpepper(theOrder);
        theOrder = new BlackOlives(theOrder);
        theOrder = new Cheese(theOrder);
        theOrder = new GreenOlives(theOrder);
        theOrder = new Ham(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Double pizza doe + bellpepper + black olives + cheese + green olives + ham", description);
    }

    @Test
    public void testBasicDoePizzaWithCheeseStuffedCrustWithStuffGetCost() {
        //Given
        PizzaOrder theOrder = new BasicWIthCheeseStuffedCrust();
        theOrder = new Mushrooms(theOrder);
        theOrder = new Onion(theOrder);
        theOrder = new Pepperoni(theOrder);
        theOrder = new Pinapple(theOrder);
        theOrder = new Spinache(theOrder);
        theOrder = new Tomatoes(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(45), theCost);
    }

    @Test
    public void testBasicDoePizzaWithCheeseStuffedCrustWithStuffGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicWIthCheeseStuffedCrust();
        theOrder = new Mushrooms(theOrder);
        theOrder = new Onion(theOrder);
        theOrder = new Pepperoni(theOrder);
        theOrder = new Pinapple(theOrder);
        theOrder = new Spinache(theOrder);
        theOrder = new Tomatoes(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza doe with cheese stuffed crust + mushrooms + onions + pepperoni + pinapple + spinache + tomatoes", description);
    }
}
