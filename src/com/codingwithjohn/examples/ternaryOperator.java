package com.codingwithjohn.examples;

import com.codingwithjohn.animals.Cat;

public class ternaryOperator {

    public static void main(String[] args) {

        int catsAge = 9;

        String ageDescription = (catsAge >= 10) ? "elderly" : "young";
        System.out.println("The cat is " + ageDescription);

        int a = 13;
        int b = 13;

        int max = (a > b) ? a : b;
        System.out.println("The max is " + max);

        Cat myCat = null;
        myCat.setAge(10);

        int myCatsAge;
        myCatsAge = myCat != null ? myCat.getAge() : 0;
        System.out.println("My cat's age is " + myCatsAge);
    }
}
