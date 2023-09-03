package com.codingwithjohn.examples;

public class LogicalOperators {

    public static void main(String[] args) {

        int age1 = 22;
        int age2 = 16;

        if (age1 >= 18 && age2 >= 18) {
            System.out.println("Both are adults");
        } else if (age1 >= 18 || age2 >= 18) {
            System.out.println("At least one is an adult");
        } else {
            System.out.println("Neither is an adult");
        }
    }
}
