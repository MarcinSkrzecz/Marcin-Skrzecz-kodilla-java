package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        OddNumbersExterminator testArray = new OddNumbersExterminator();
        System.out.println("Test: Case when ArrayList is empty");
        //Then
        Assert.assertEquals(testArray.exterminate(numbers), numbers);
    }

        @Test
        public void testOddNumbersExterminatorNormalList(){
            //Given
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = 0; i < 7; i++){
                numbers.add(i);
            }
            ArrayList<Integer> evenList = new ArrayList<Integer>();
            evenList.add(0);
            evenList.add(2);
            evenList.add(4);
            //When
            OddNumbersExterminator testArray = new OddNumbersExterminator();
            System.out.println("Test: Case when ArrayList is not empty");
            //Then
            Assert.assertEquals(testArray.exterminate(numbers), evenList);
        }
}