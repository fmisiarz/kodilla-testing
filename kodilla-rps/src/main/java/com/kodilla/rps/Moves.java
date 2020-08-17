package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Moves {
    Scanner scGamesAmount = new Scanner(System.in);
    Scanner scPlayAgain = new Scanner(System.in);

    Scanner scUserChoice = new Scanner(System.in);
    Random rand = new Random();


    public void playAgain() {
        System.out.println("Do You want to play more games?\n Press 1 if YES\n Press 2 if NO");
        int playAgain = scPlayAgain.nextInt();
        if (playAgain == 1) {
            game();
        } else {
            System.out.println("Thanks for the time");
        }
    }

    public void game() {
        boolean end = false;

        System.out.println("Please enter the number of games You want to play: ");
        int gamesAmount = scGamesAmount.nextInt();
        System.out.println("Okay we will play: " + gamesAmount + " times..\n " +
                "Name of the game is: Paper,Scissors,Rock. " +
                "Please enter the number from 1 to 3\n1 is paper,\n2 is scissors,\n3 is rock " +
                "Good luck!");
        while (!end) {
            for (int i = 0; i < gamesAmount; i++) {
                System.out.println("please enter Your choice");
                int userChoice = scUserChoice.nextInt();
                int x = rand.nextInt(3);

                if (userChoice == 1) {
                    System.out.println("Your choice is: paper.");
                    if (x == 1) {
                        System.out.println("Choice of the computer is: paper");
                        System.out.println("its a tie!");
                    } else if (x == 2) {
                        System.out.println("Choice of the computer is: scissors");
                        System.out.println("You lose");
                    } else {
                        System.out.println("Choice of the computer is: rock");
                        System.out.println("You win");

                    }
                } else if (userChoice == 2) {
                    System.out.println("Your choice is: scissors.");
                    if (x == 1) {
                        System.out.println("Choice of the computer is: paper");
                        System.out.println("You win");
                    } else if (x == 2) {
                        System.out.println("Choice of the computer is: scissors");
                        System.out.println("Its a tie!");
                    } else {
                        System.out.println("Choice of the computer is: rock");
                        System.out.println("You lose");

                    }
                } else {
                    System.out.println("Your choice is: rock.");
                    if (x == 1) {
                        System.out.println("Choice of the computer is: paper");
                        System.out.println("You lose");
                    } else if (x == 2) {
                        System.out.println("Choice of the computer is: scissors");
                        System.out.println("You win");
                    } else {
                        System.out.println("Choice of the computer is: rock");
                        System.out.println("Its a tie!");
                    }
                }


            }
            end = true;
        }
    }
}