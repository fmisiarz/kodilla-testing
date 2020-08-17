package com.kodilla.exception.test;

import java.util.stream.Stream;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3, 0);
        } catch (ArithmeticException a) {
            System.out.println("You can not divide by 0 !!");
        }finally {
            System.out.println("Remember. please never divide by zero 0 !!!!");
        }
    }}