package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> number) {
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        for (Integer numbers : number) {
            if (numbers % 2 == 0) {
                numbers2.add(numbers);
            }
        }

        return numbers2;
    }
}