package com.codingwithjohn.examples;

public class StringStuff {

    public static void main(String[] args) {

        String myString = "Hello world! \"Escape\" \nThis is a new line. \n\tThis is a tab on a new line.";
        System.out.println(myString);

        String firstName = "      John";
        String lastName = "Doe       ";

        String fullName = firstName + " " + lastName;

        int fullNameLength = fullName.length();

        System.out.println(fullNameLength);
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.indexOf("Doe"));
        System.out.println(fullName);
        System.out.println(fullName.trim());

    }
}
