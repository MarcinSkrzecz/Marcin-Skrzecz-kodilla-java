package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        if(numbers.length > 0) {
            IntStream.range(0, numbers.length)
                    .filter(n -> n != 0)
                    .map(id -> numbers[id])
                    .forEach(System.out::println);
        } else {
            System.out.println("Table is empty");
        }

        if(numbers.length > 0) {
            OptionalDouble averageList = IntStream.range(0, numbers.length)
                    .mapToDouble(id -> numbers[id])
                    .average();
            double averageDouble = averageList.getAsDouble();
            return averageDouble;
        } else {
            return 0;
        }
    }
}