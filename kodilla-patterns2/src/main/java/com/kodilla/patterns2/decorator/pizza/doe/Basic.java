package com.kodilla.patterns2.decorator.pizza.doe;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class Basic implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String getDescription() {
        return "Basic pizza doe";
    }
}