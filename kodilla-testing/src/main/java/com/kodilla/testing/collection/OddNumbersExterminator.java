package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        if (numbers.isEmpty()){
            return numbers;
        } else {
            ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
            for (int i = 0; i < numbers.size(); i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
            }
            return evenNumbers;
        }
    }
}