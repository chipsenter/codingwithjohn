package com.codingwithjohn.examples;

public class Methods {

    public static void main(String[] args) {

        sayHi();
        System.out.println("The total is: " + add(5, 10));
        sayBye();
    }

    private static void sayHi() {

        System.out.println("Hi!");
    }

    private static int add(int firstNum, int secondNum) {

        return firstNum + secondNum;
    }

    private static void sayBye() {

        System.out.println("Goodbye!");
    }
}
