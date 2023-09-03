package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Cat;
import com.codingwithjohn.animals.Dog;

public class ClassesAndObjects {

    public static void main(String[] args) {

        Dog myDog = new Dog(4, true);
        myDog.setName("Fido");
        myDog.setAge(3);
        myDog.setBreed("Poodle");
        myDog.setColor("White");
        myDog.setNumberOfLegs(4);
        myDog.setAlive(true);

        System.out.println("My dog's name is: " + myDog.getName());
        myDog.bark(5);

        Dog yourDog = new Dog(4, true);
        yourDog.setName("Spot");
        yourDog.setAge(5);
        yourDog.setBreed("Dalmation");
        yourDog.setColor("Black and White");
        yourDog.setNumberOfLegs(4);
        yourDog.setAlive(true);

        System.out.println("Your dog's name is: " + yourDog.getName());
        yourDog.bark(1);

        Cat myCat = new Cat();
        myCat.setName("Felix");
        myCat.setAge(3);
        myCat.setBreed("Siamese");
        myCat.setColor("White");
        myCat.setNumberOfLegs(4);
        myCat.setAlive(true);

        System.out.println("My cat's name is: " + myCat.getName());

        Car myCar = new Car();
        myCar.make = "Ford";
        myCar.model = "Mustang";
        myCar.year = 2019;
        myCar.color = "Red";
        myCar.numberOfDoors = 2;
        myCar.isRunning = true;
        myCar.vin = "1234567890";
        myCar.speed = 65;
        myCar.isElectric = false;
        myCar.start();
    }
}
