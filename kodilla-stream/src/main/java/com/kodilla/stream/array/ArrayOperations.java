package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static void getAverage(int[] numbers){
        IntStream.range(0, numbers.length).map(n->numbers[n]).forEach(n->System.out.println(n));
        double a=IntStream.range(0, numbers.length).map(n->numbers[n]).average().getAsDouble();
        System.out.println(a);
    }
}
