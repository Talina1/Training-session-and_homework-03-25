package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        int intVar1 = 12;
        int intVar2 = 20;
        short shortSum = (short) (intVar1 + intVar2);
        System.out.println(shortSum);

        shortSum++;

        System.out.println("Post incrementation result: " + shortSum++);

        byte byteSum = (byte) (intVar1 + intVar2);

        System.out.println(byteSum);

        ++byteSum;

        System.out.println("Pre incrementation result: " + ++byteSum);
    }

    static void task2() {

        float floatNumber = 2022.12567f;

        System.out.println(Math.floor(floatNumber));
        System.out.println(Math.round(floatNumber));
        System.out.println(Math.ceil(floatNumber));
    }

    static void task3() {

        double angle_degree_X = 45, angle_degree_Y = 60;

        System.out.println(Math.sin(angle_degree_X));
        System.out.println(Math.cos(angle_degree_X));
        System.out.println(Math.tan(angle_degree_X));
        System.out.println(Math.asin(angle_degree_X));
        System.out.println(Math.acos(angle_degree_X));
        System.out.println(Math.atan(angle_degree_X));
        System.out.println(Math.atan2(angle_degree_Y, angle_degree_X));
    }

    static void task4() {
        //Homework
        //Increment and decrement
        int value = 10;

        ++value;
        System.out.println("results of value after increment: " + value);

        int another_value = 12;
        --another_value;
        System.out.println("results of value after decrement: " + another_value);

        // Bitwise Complement Operator

        byte byteVal1 = 12, byteVal2 = 10;
        byte res;

        // Bitwise complement byteVal1
        res = (byte) ~byteVal1;
        System.out.println("The result: " + res);
        // Bitwise AND operation
        res = (byte) (byteVal1 & byteVal2);
        System.out.println("The result: " + res);
        // Bitwise OR operation
        res = (byte) (byteVal1 | byteVal1);
        System.out.println("The result: " + res);
        // Bitwise XOR operation
        res = (byte) (byteVal1 ^ byteVal2);
        System.out.println("The result: " + res);

        // Arithmetic Operator

        int val1 = 10, val2 = 5;
        // Addition
        int addition = (val1 + val2);
        System.out.println(addition);
        // Subtraction
        int subtraction = (val1 - val2);
        System.out.println(subtraction);
        // Multiplication
        int multiplication = (val1 * val2);
        System.out.println(multiplication);
        // Division
        int division = (val1 / val2);
        System.out.println(division);
        // Modulus
        int modulus = (val1 % val2);
        System.out.println(modulus);

        // Relational Operator

        int pack1 = 10, pack2 = 20;
        System.out.println(pack1 < pack2);

        // Conditional operator

        String out;
        int a = 15, b = 7;
        out = a == b ? "Yes" : "No";
        System.out.println("Answer: " + out);

        out = a >= b ? "Yes" : "No";
        System.out.println("Answer: " + out);
    }

    static void task5() {
        //Homework
            float distance_in_meters = 2500;
            float distance_in_kilometers = distance_in_meters / 1000;
            float distance_in_miles = (float) (distance_in_kilometers / 1.609);

        String input = "05:56:23";
        LocalTime time = LocalTime.parse(input);
        int seconds = time.toSecondOfDay();
        float hours = (float) seconds / 3600;
        float metersPerSecond = (float) distance_in_meters / seconds;
        float kilometersPerSecond = (float) distance_in_kilometers / hours;
        float milesPerHour = (float) distance_in_miles / hours;

        System.out.println("Your speed in meters/second is: " + metersPerSecond);
        System.out.println("Your speed in hm/h is: " + kilometersPerSecond);
        System.out.println("Your speed in miles/h is: " + milesPerHour);

    }
}
