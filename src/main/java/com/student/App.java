package com.student;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(5, 3));

        System.out.println("Subtraction: " + calculator.subtract(10, 4));
    }
}
