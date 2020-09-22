package com.kodilla.patterns2.decorator.pizza.doe;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class Double implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10.00);
    }

    @Override
    public String getDescription() {
        return "Double pizza doe";
    }
}