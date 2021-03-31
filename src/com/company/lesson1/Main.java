package com.company.lesson1;

public class Main {
    public static void main(String[] args) {
        byte v = 1;
        short s = 2;
        int i = 3;
        long l = 1234567891011L;
        float f = 11.5f;
        double w = 12.5;
        char z = 'A';
        boolean boolT = true;
        boolean boolF = false;
    }
    private static float calculateNumbers(float a, float b, float c, float d) {return a * (b + (c/d));}
    private static boolean isNumbersSumInRangeFrom10To20(int a, int b) {
    int sum = a + b;
    return sum >= 10 && sum <= 20;
    }
    private static void printHelloForName(String name) { System.out.println("Hello, " + name + " !"); }
    public static void printIsYearLeap(int year) {
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " Year - Leap");
        } else {
            System.out.println(year + " Year - Not Leap");
        }
}}

