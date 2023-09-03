package com.codingwithjohn.animals;

public class Cat extends Animal{
    private String name;
    private String litterPreference;
    private int age;
    private String breed;
    private String color;
    private int numberOfLegs;
    private boolean isAlive;

    void meow(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("(1) Miooouw!" + name + " says Miow!" + " I'm " + age + " years old." + " I'm a " + breed + " and I'm " + color + " in color." + " I have " + numberOfLegs + " legs." + " Am I alive? " + isAlive);
        }

    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int i) {
        if (age < 0) {
            System.out.println("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
