package com.company;


import java.util.Scanner;

/**
 * The AddNumbers program implements an application that
 * simply adds two numbers provided by the user and displays the result.
 * This program serves as an example for writing Javadoc and generating HTML documentation.
 *
 * @author YourName
 * @version 1.0
 */
public class AddNumbers {

    /**
     * The main method that runs the program. It prompts the user to enter two numbers
     * and then displays the sum of these numbers.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double sum = add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }

    /**
     * Adds two numbers and returns the result.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}

