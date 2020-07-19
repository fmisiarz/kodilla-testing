package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
        public void exterminate(ArrayList<Integer> number){
        ArrayList<Integer> numbers2=new ArrayList<Integer>();
            for (int i=0; i<number.size();i++){
             if (number.get(i)%2==0){
                 numbers2.add(i);
                 System.out.println("Even number: "+number.get(i));

            }}
            System.out.println("Size of the first list with all numbers: "+number.size());
            System.out.println("Size of the second list only with even numbers: "+numbers2.size());
}
}