package com.codingwithjohn.examples;

import java.util.Scanner;

public class CalculateYourHeightInInches {

    public static void main(String[] args) {

        int feet;
        int inches;
        int totalInches;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your height in feet: ");
        feet = userInput.nextInt();

        System.out.println("Please enter your height in inches: ");
        inches = userInput.nextInt();

        totalInches = (feet * 12) + inches;

        System.out.println("You are " + feet + " feet and " + inches + " inches tall.\n That is " + totalInches + " inches tall.");

    }
}
