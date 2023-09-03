package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Dog;

public class Constructors {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        Dog yourDog = new Dog(4, true);
        yourDog.setBreed("Poodle");
        yourDog.setFurry(true);
        myDog.setAge(10);
        myDog.setName("Jo-Jo");

        if (yourDog.getIsAlive()) {
            System.out.println("Your dog is alive!");
            String aLive = "Yes";
            System.out.println("My dog has "
                    + myDog.getNumberOfLegs()
                    + " legs.And its a live? "
                    + aLive
                    + "!, is it furry? "
                    + myDog.isFurry()
                    + " my dog is: "
                    + myDog.getAge()
                    + " years old."
                    + " My dog's name is: " + myDog.getName());
        } else {
            System.out.println("Your dog is dead!");
        }

        System.out.println("Your dog "
                + yourDog.getBreed()
                + " has "
                + yourDog.getNumberOfLegs()
                + " legs.And its alive? "
                + yourDog.getIsAlive());
    }
}
