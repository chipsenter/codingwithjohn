package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Dog;

public class GettersAndSetters {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.setAge(-10);
        System.out.println("My dog is " + myDog.getAge() + " years old.");


    }
}
