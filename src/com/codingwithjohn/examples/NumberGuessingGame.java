package com.codingwithjohn.examples;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            int userGuess;
            int numberOfGuesses = 0;

            System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

            while (true) {
                userGuess = getUserGuess();
                numberOfGuesses++;

                if (userGuess == randomNumber) {
                    System.out.println("You guessed it! It took you " + numberOfGuesses + " guesses.");
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (!playAgain()) {
                break;
            }
        }
    }

    private static int getUserGuess() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static boolean playAgain() {
        return false;
    }


}
