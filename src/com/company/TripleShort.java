package com.company;
// A class to manage three Short values
public class TripleShort {
    private Short item1; // Data value 1
    private Short item2; // Data value 2
    private Short item3; // Data value 3

    // Constructor to initialize the three Short values
    public TripleShort(Short item1, Short item2, Short item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    // Method to print all data member values
    public void printAll() {
        System.out.println("(" + item1 + ", " + item2 + ", " + item3 + ")");
    }

    // Method to find and return the minimum value among the three shorts
    public Short minItem() {
        Short minVal = item1; // Holds minimum item value, init to first item

        if (item2.compareTo(minVal) < 0) {
            minVal = item2;
        }
        if (item3.compareTo(minVal) < 0) {
            minVal = item3;
        }
        return minVal; // Return the minimum value
    }
}
//Explanation:
//Non-Generic Code: The above two classes do the same thing (storing and finding the minimum of three numbers) but for different data types (Integer and Short). This leads to code duplication, making the code harder to maintain.
//Key Issue: If you wanted to support another type (e.g., Double), you would need to create yet another class (TripleDouble), leading to even more duplication.