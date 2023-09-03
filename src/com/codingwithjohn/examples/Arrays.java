package com.codingwithjohn.examples;

public class Arrays {

    public static void main(String[] args) {

        String[] cars = {"Ford", "Honda", "Toyota", "Nissan", "Kia"};
        System.out.println(cars.length);

        // [0] [1] [2] [3]
        cars[4] = "Toyota"; // this is an array literal
        System.out.println(cars[4]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            if (i == 1) {
                cars[i] = "BMW";
                System.out.println("That's my favorite car!");
            }
        }

        for (String car : cars) {
            System.out.println(car);
        }

        int[] myArray;
        int arraySize = 5;
        myArray = new int[arraySize];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        for (int myArr : myArray) {
            System.out.println(myArr);
        }

        int valueToMove = 50;
        int sourceIndex = -2;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == valueToMove) {
                sourceIndex = i;
                System.out.println("Found " + valueToMove + " at index " + sourceIndex);
                break;
            }
        }

        if (sourceIndex != -1) {

            int destinationIndex = 0; // where we want to move the value to
            int temp = myArray[sourceIndex];

            if (destinationIndex > sourceIndex) {
                for (int i = sourceIndex; i < destinationIndex; i++) {
                    myArray[i] = myArray[i + 1];
                }
            } else {
                for (int i = sourceIndex; i > destinationIndex; i--) {
                    myArray[i] = myArray[i - 1];
                }
            }

            myArray[destinationIndex] = temp;
            System.out.println("Moved " + valueToMove + " to index " + destinationIndex);

            for (int value : myArray) {
                System.out.println(value + " ");
            }
        } else {
            System.out.println("Could not find " + valueToMove);
        }
        System.out.println("My array looks like this now:" + myArray[0]);


        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char targetChar = 'c'; // The character you want to find
        boolean found = false;


        int index = -1; // The index of the character if found
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == targetChar) {
                index = i;
                System.out.println("Found " + targetChar + " at index " + index);
                found = true;
                break; // Exit the loop if the character is found
            }
        }

        for (char c : charArray) {
            if (c == targetChar) {
                index = c;
                System.out.println(targetChar + " Found inside of foreach loop at index " + index);
                found = true;
                break; // Exit the loop if the character is found
            }
        }

        if (found) {
            System.out.println("Character '" + targetChar + "' found in the array.");
        } else {
            System.out.println("Character '" + targetChar + "' not found in the array.");
        }


    }


}
