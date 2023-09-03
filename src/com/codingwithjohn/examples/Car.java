package com.codingwithjohn.examples;

public class Car {

    String make;
    String model;
    int year;
    String color;
    int numberOfDoors;
    boolean isRunning;
    String vin;
    int speed;
    Boolean isElectric;

    void start() {
        isRunning = true;
        System.out.println("\n(2) The " +
                make +
                " " + model +
                " " + year +
                " is " + color +
                " with " +
                numberOfDoors +
                " doors and VIN " +
                vin + " is running a current speed of " +
                speed + " mph, car is on. " + isRunning + ", and is electric. " + isElectric + " Vroom!");
    }

    void stop() {
        isRunning = false;
        System.out.println("The car is stopped.");
    }
}
