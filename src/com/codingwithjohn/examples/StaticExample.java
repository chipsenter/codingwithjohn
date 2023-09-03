package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Dog;

public class StaticExample {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        Dog yourDog = new Dog(4, true);
        Dog someonesDog = new Dog(3, false);
        myDog.bark(3);

        Dog.printMetaDogInfo();

    }
}
