package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        double s;
        IntStream.range(0, numbers.length).map(n->numbers[n]).forEach(n->System.out.println(n));
        return s=IntStream.range(0, numbers.length).map(n->numbers[n]).average().getAsDouble();
    }
}