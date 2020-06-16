package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With Sesame")
                .burgers(3)
                .sauce("hot")
                .ingredient("Salad")
                .ingredient("Onion")
                .ingredient("Beacon")
                .ingredient("Cucumber")
                .ingredient("Chili peppers")
                .ingredient("Mushrooms")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(8, howManyIngredients);
    }
}