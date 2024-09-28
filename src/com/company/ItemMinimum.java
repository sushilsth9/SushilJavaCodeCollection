package com.company;

// A utility class to demonstrate a generic method for finding the minimum
public class ItemMinimum {
    // Generic method to find the minimum of three items
    public static <TheType extends Comparable<TheType>> TheType tripleMin(TheType item1, TheType item2, TheType item3) {
        TheType minVal = item1; // Initialize to the first item

        if (item2.compareTo(minVal) < 0) {
            minVal = item2;
        }
        if (item3.compareTo(minVal) < 0) {
            minVal = item3;
        }
        return minVal; // Return the minimum value
    }

    // Main method to demonstrate the use of the generic method
    public static void main(String[] args) {
// Test case with Integers
        Integer num1 = 55, num2 = 99, num3 = 66;
        System.out.println("Min: " + tripleMin(num1, num2, num3)); // Output: Min: 55

// Test case with Characters
        Character letter1 = 'a', letter2 = 'z', letter3 = 'm';
        System.out.println("Min: " + tripleMin(letter1, letter2, letter3)); // Output: Min: a

// Test case with Strings
        String str1 = "zzz", str2 = "aaa", str3 = "mmm";
        System.out.println("Min: " + tripleMin(str1, str2, str3)); // Output: Min: aaa
    }
}

