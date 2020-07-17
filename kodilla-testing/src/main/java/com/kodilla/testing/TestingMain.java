package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
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
        SimpleUser forumUser=new SimpleUser("Michal");
        String result =forumUser.getUsername();
    if (result.equals("Michal")){
        System.out.println("User- test OK!");
    } else {
        System.out.println("ERROR!!");
    }
    }
}
