package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleCalculator {
    double a;
    double b;
    public SimpleCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double c = 0;

    public void sum() {
        c = a + b;
        System.out.println("Suma podanych 2 liczb to: " + c);
    }

    public void substract() {
        c = a - b;
        System.out.println("Różnica podanych 2 liczb to: " + c);
    }
}

class AdvancedCalculator {

    private List<Integer> numbers;

    public AdvancedCalculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    int sumresults = 0;

    public void sum2() {
        for(int i = 0 ; i < numbers.size(); i++) {
            sumresults += numbers.get(i);
        }
        System.out.println("Suma podanych " + numbers.size() + " liczb to: " + sumresults);
    }

    int subquery = 0;
    int subresults;

    public void substract2() {
        for(int j = 0 ; j < numbers.size(); j++) {
            subquery -= numbers.get(j);
        }
        subresults = numbers.get(0) + subquery;

        System.out.println("Różnica podanych " + numbers.size() + " liczb to: " + subresults);
    }

}

class Application {
    public static void main (String[] args) {
        SimpleCalculator calc = new SimpleCalculator(10, 30);

        calc.sum();
        calc.substract();

        AdvancedCalculator calc2 = new AdvancedCalculator(Arrays.asList(1, 2, 3));

        calc2.sum2();
        calc2.substract2();
    }
}