package com.kodilla.testing;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc1=new Calculator(5,3);
int addRes=calc1.add();
int subRes=calc1.subtract();
if (addRes==8 || subRes==2) {
    System.out.println("Calculator- TEST OKAY");
}else {
    System.out.println("ERROR!");
}
        SimpleUser forumUser=new SimpleUser("Michal","pietrek");
        String result =forumUser.getUsername();
    if (result.equals("Michal")){
        System.out.println("User- test OK!");
    } else {
        System.out.println("ERROR!!");
    }
        OddNumbersExterminator ext1= new OddNumbersExterminator();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        for (int i=0; i<5;i++) {
            numbers.add(i + 1);
        }
    ext1.exterminate(numbers);
    }
}
