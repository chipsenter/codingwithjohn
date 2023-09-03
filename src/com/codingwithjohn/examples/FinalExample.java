package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Dog;

public class FinalExample {

    static final double pi = 3.14159;
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setName("Larry");
        myDog.bark(3);
        myDog.eat();

        System.out.println("My dog's name is " + myDog.getName());
        System.out.println("The value of pi is " + pi * 4);
        double newPi = pi * 4;
        System.out.println("The value of pi is " + newPi);

        final String myName;
        myName = "Johan";
        System.out.println("My name is " + myName);
    }
}
