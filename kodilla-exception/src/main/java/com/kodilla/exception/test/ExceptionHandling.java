package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("ERROR: x is not 1 and/or y is 1.5 "+e);
        }finally {
            System.out.println("x has to be 1 and y can not be 1.5");
        }

    }}
