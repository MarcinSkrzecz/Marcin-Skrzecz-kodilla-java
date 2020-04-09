package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.sql.SQLOutput;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("1.0 test OK");
        } else {
            System.out.println("1.0 Error!");
        }

        //--------------------------//

        Calculator calculator = new Calculator(15, 5);

        int calculatorAdd = calculator.getAdd();
        int calculatorSubstract = calculator.getSubstract();

        if (calculatorAdd == 20) {
            System.out.println("2.1 test OK");
        } else {
            System.out.println("2.1 Error!");
        }

        if (calculatorSubstract == 10) {
            System.out.println("2.2 test OK");
        } else {
            System.out.println("2.2 Error!");
        }
    }
}