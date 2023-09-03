package com.codingwithjohn.examples;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("How old are you: ");
        int age = userInput.nextInt();

        if (age < 10) {
            System.out.println("You are too young to use this program.");
            System.exit(0);
        } else if (age >= 100) {
            System.out.println("You are too old to use this program.");
            System.exit(0);
        } else {
            System.out.println("You are " + age + " years old.");
        }
    }
}
