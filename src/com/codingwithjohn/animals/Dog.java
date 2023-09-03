package com.codingwithjohn.animals;

public class Dog extends Animal {

    static int dogCount = 0;
    private String name;
    private int age;
    private String breed;
    private String color;
    private int numberOfLegs;
    private boolean isAlive;
    private boolean furry;
    private int walkDistancePreference;

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isFurry() {
        return furry;
    }

    public void setFurry(boolean furry) {
        this.furry = furry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }

    public Dog() {
        dogCount++;
    }

    public Dog(int numberOfLegs, boolean isAlive) {
        System.out.println("A new dog has been created!");
        this.numberOfLegs = numberOfLegs;
        this.isAlive = isAlive;
        dogCount++;
    }

    @Override
    public void eat() {
        System.out.println("I am eating steak pebbles!, yum yum yum!");
    }

    public void bark(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Woof!");
        }
    }

    public void barkingWithInfo(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("(1) Woof!" + name + " says woof!" + " I'm " + age + " years old." + " I'm a " + breed + " and I'm " + color + " in color." + " I have " + numberOfLegs + " legs." + " Am I alive? " + isAlive);
        }
    }

    public static void printMetaDogInfo() {
        System.out.println("Total dogs: " + dogCount);
    }

    //  public com.codingwithjohn.animals.Dog() {
//    System.out.println("A new dog has been created!");
////    this.numberOfLegs = 8;
//    this.isAlive = false;
//    this.furry = true;
//  }

}
