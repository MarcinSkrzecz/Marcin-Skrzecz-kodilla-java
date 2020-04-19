package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(id -> numbers[id])
                .forEach(System.out::println);

        OptionalDouble averageList = IntStream.range(0, numbers.length)
                .mapToDouble(id -> numbers[id])
                .average();
        double averageDouble = averageList.getAsDouble();
        return averageDouble;
    }

}