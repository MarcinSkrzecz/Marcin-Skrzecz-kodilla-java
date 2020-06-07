package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(5,6);
        double sub = calculator.sub(11,6);
        double mul = calculator.mul(11,11);
        double div = calculator.div(36,6);
        //Then
        Assert.assertEquals(11,sum,0.1);
        Assert.assertEquals(5,sub,0.1);
        Assert.assertEquals(121,mul,0.1);
        Assert.assertEquals(6,div,0.1);
    }
}
