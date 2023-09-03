package com.codingwithjohn.examples;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");

        int tries = 10;

        while (tries > 0) {
            System.out.println("You have " + tries + " guesses left");
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            String result = (guess < randomNumber) ? "Your guess is too low"
                    : (guess > randomNumber) ? "Your guess is too high"
                    : "You guessed the right number You win!";
            System.out.println(result);
            tries--;
            if (result.equals("You guessed the right number You win!")) {
                System.out.println("You guessed it in " + (tries - tries) + " tries!" + "You win!");
                break;
            }


//            if (guess < randomNumber) {
//                System.out.println();
//            } else if (guess > randomNumber) {
//                System.out.println("Your guess is too high");
//            } else {
//                System.out.println("You win!");
//                break;
//            }
        }
    }
}
