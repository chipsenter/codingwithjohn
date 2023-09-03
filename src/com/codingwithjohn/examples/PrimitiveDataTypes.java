package com.codingwithjohn.examples;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // -128 to 127 (8 bits)
        byte myByte = 100;

        // -32768 to 32767 (16 bits)
        short myShort = 10000;

        // -2,147,483,648 to 2,147,483,647 (32 bits)
        int myInt = 1000000000;

        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (64 bits)
        long myLong = 1000000000000000000L;

        // 3.4e−038 to 3.4e+038 about 6 decimal places (32 bits)
        float myFloat = 3.14f;

        // 1.7e−308 to 1.7e+308 about 15 decimal places (64 bits)
        double myDouble = 3.14;

        // true or false only (1 or 0)
        boolean myBoolean = true;

        // Unicode characters (single quotes) (0 to 65535) (16 bits)
        char myChar = 'A';
    }
}
