package com.company;

import java.util.Scanner;

public class Vowel_counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to count vowel: ");
        String str=input.nextLine();

    }
}
//Problem: Vowel Counter
//Description: Write a Java program that counts the number of vowels in a given string. The program should take the string input from the user, use a method to count the vowels, and then print the count. The program should not use any built-in string methods (like String.charAt, String.length, etc.) for counting vowels.

//Steps:
//User Input: Prompt the user to enter a string.
 //       Method: Create a method to count the vowels in the string.
//Loop: Use a loop to iterate through the string.
//If-Else: Use if-else statements to check if each character is a vowel.
//Print Result: Print the total number of vowels in the string.