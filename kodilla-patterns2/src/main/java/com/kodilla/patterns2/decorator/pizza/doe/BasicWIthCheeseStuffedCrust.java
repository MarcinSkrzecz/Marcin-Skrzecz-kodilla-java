package com.kodilla.patterns2.decorator.pizza.doe;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class BasicWIthCheeseStuffedCrust implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getDescription() {
        return "Basic pizza doe with cheese stuffed crust";
    }
}