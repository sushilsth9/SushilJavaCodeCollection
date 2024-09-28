package com.company;

public class TripleItemManager {
    public static void main(String[] args) {
        // TripleItem class with Integers
                TripleItem<Integer> triInts = new TripleItem<>(9999, 5555, 6666);
        triInts.printAll(); // Output: (9999, 5555, 6666)
        System.out.println("Min: " + triInts.minItem() + "\n"); // Output: Min: 5555

// TripleItem class with Shorts
        TripleItem<Short> triShorts = new TripleItem<>((short) 99, (short) 55, (short) 66);
        triShorts.printAll(); // Output: (99, 55, 66)
        System.out.println("Min: " + triShorts.minItem()); // Output: Min: 55
    }
}
