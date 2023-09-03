package com.codingwithjohn.examples;

public class ForLoops {

    public static void main(String[] args) {

        int myNum = 1;
        System.out.println("While loop starting");
        while (myNum <= 100) {
            System.out.printf("myNum = %d\n", myNum);
            myNum++;
        }
        System.out.println("While loop ending");
        System.out.println("For loop + Nested For loops starting");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        System.out.println("For loop ending\n");
    }
}
