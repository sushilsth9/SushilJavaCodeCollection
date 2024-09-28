package com.company;

// A generic class that can manage three items of any comparable type
public class TripleItem<TheType extends Comparable<TheType>> {
    private TheType item1; // Data value 1
    private TheType item2; // Data value 2
    private TheType item3; // Data value 3

    // Constructor to initialize the three items
    public TripleItem(TheType i1, TheType i2, TheType i3) {
        item1 = i1;
        item2 = i2;
        item3 = i3;
    }

    // Method to print all data member values
    public void printAll() {
        System.out.println("(" + item1 + ", " + item2 + ", " + item3 + ")");
    }

    // Method to find and return the minimum value among the three items
    public TheType minItem() {
        TheType minVal = item1; // Holds minimum item value, init to first item

        if (item2.compareTo(minVal) < 0) {
            minVal = item2;
        }
        if (item3.compareTo(minVal) < 0) {
            minVal = item3;
        }
        return minVal; // Return the minimum value
    }
}


