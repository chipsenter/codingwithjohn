package com.codingwithjohn.examples;

import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args) {

        String name;
        String lastName;
        String gender;
        int age;
        int weight;
        float shoesize;
        float heightMale;
        float heightFemale;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your gender? Male or Female?");
        gender = userInput.nextLine();
        String newGender = gender.toLowerCase();
        while (true) {
            if (newGender.equals("male")) {
                System.out.println("Great! you're a " + gender + " much appreciated! You can actually answer a simple question");
                break;
            } else if (newGender.equals("female")) {
                System.out.println("Great! you're a " + gender + " much appreciated! You can actually answer a simple question");
                break;
            } else {
                System.out.println("Unfortunately you have some sort of sickness that makes you unable to answer a simple question, please seek help!");
            }
        }


        System.out.println("Please enter your firstname: ");
        name = userInput.nextLine();
        if (name != null && !name.isEmpty()) {
            String firstLetter = name.substring(0, 1).toUpperCase();
            String restOfName = name.substring(1).toLowerCase();
            String result = firstLetter + restOfName;
            System.out.println("Please enter your lastname: ");
            lastName = userInput.nextLine();
            if (lastName != null && !name.isEmpty()) {
                String firstLetterLastName = lastName.substring(0, 1).toUpperCase();
                String restOfNameLastName = lastName.substring(1).toLowerCase();
                String result2 = firstLetterLastName + restOfNameLastName;
                System.out.println("Hey and welcome! " + result + " " + result2 + "\n");
                String fullName = result + " " + result2;

                System.out.println("How old are you: " + fullName + "?");
                age = userInput.nextInt();

                if (age < 10) {
                    System.out.println("You are too young to use this program.\n");
                    System.exit(0);
                } else if (age > 100) {
                    System.out.println("You are too old to use this program.\n");
                    System.exit(0);
                } else if (age > 50 && age < 60) {
                    System.out.println("Soon time for pension!\n");
                } else if (age > 60 && age < 80) {
                    System.out.println("Enjoy pension and grand kids!\n");
                } else if (age > 80 && age < 100) {
                    System.out.println("You're on overtime unfortunately!\n");
                } else {
                    System.out.println("You are " + age + " years old, right on!\n");
                }

                System.out.println("What is your shoe size: " + result + "?");
                shoesize = userInput.nextFloat();

                System.out.println("You input " + shoesize);
                if (shoesize >= 14.0) {
                    System.out.println(shoesize + "! Holy jesus you have big feet!, you must be a giant!");
                } else if (shoesize >= 9.0 && shoesize <= 13.9) {
                    System.out.println("You have normal sized feet.\n");
                } else if (shoesize > 6.0 && shoesize < 9.0) {
                    System.out.println("You have small feet.\n");
                } else if (shoesize > 0 && shoesize <= 6.0) {
                    System.out.println("You have tiny feet.\n");
                } else {
                    System.out.println("You have no feet.\n");
                }

                System.out.println("How tall are you ?");
                heightMale = userInput.nextFloat();
                heightFemale = userInput.nextFloat();

                if (gender.equals("male")) {
                    System.out.println("You're " + heightMale + " tall.");
                    if (heightMale > 7.0) {
                        System.out.println("Damn son you must have Giant genes!\n");
                    } else if (heightMale > 6.1 && heightMale <= 7.0) {
                        System.out.println("You're above average height for a human, you should consider playing basketball");
                    } else if (heightMale > 5.1 && heightMale <= 6.1) {
                        System.out.println("You're height is normal\n");
                    } else {
                        System.out.println("You're a midget!\n");
                    }
                } else {
                    System.out.println("You're " + heightFemale + " tall.");
                    if (heightMale > 7.0) {
                        System.out.println("Holy hell you must have Giant genes!\n");
                    } else if (heightMale > 5.9 && heightMale <= 7.0) {
                        System.out.println("You're above average height for a female, you should consider playing basketball");
                    } else if (heightMale > 5.0 && heightMale <= 5.5) {
                        System.out.println("You're height is normal\n");
                    } else if (heightMale > 4.5 && heightMale <= 5.0) {
                        System.out.println("You're a lil shorty eh..\n");
                    } else {
                        System.out.println("You're a midget!\n");
                    }
                }

                System.out.println("What's your weight ?");
                weight = userInput.nextInt();
                double bmiMale = weight / (heightMale * heightMale);
                double bmiFemale = weight / (heightFemale * heightFemale);
                System.out.println("You're weight is " + weight + "\n");
                if (gender.equals("male")) {
                    if (weight >= 300) {
                        System.out.println("Consider a diet asap!, you're a legit fatty! you're current bmi measures in at: " + bmiMale);
                    } else if (weight > 200 && weight < 300) {
                        System.out.println("You're on the heavy side, consider a diet! you're current bmi measures in at: " + bmiMale);
                    }
                } else {
                    if (weight >= 300) {
                        System.out.println("Consider a diet asap!, clock is ticking for your health! you're current bmi measures in at: " + bmiFemale);
                    } else if (weight > 200 && weight < 300) {
                        System.out.println("You're on the heavy side, consider a diet you're current bmi measures in at: " + bmiFemale);
                    }
                }

            }
        }
    }
}
