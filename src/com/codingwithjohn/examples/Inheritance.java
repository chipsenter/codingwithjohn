package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Animal;
import com.codingwithjohn.animals.Dog;

public class Inheritance {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.eat();
        Dog myDog = new Dog();
        myDog.bark(3);
        myDog.eat();
        myDog.setName("Larry");
        System.out.println("My dog's name is " + myDog.getName());

    }
}
