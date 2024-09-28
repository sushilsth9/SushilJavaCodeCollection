package com.company;

public class Calculator {
    // Private fields for brand and price
    private String brand;
    private int price;

    // Constructor to initialize the brand and price fields
    public Calculator(String brand, int price) {
        this.brand = brand; // Set the brand field to the provided brand
        this.price = price; // Set the price field to the provided price
    }

    // Override the equals method from the Object class
    @Override
    public boolean equals(Object obj) {
// Check if the current object is being compared with itself
        if (this == obj) return true;

// Check if the object is null or if the classes are not the same
        if (obj == null || getClass() != obj.getClass()) return false;

// Cast the object to Calculator
        Calculator that = (Calculator) obj;

// Compare the price fields and the brand fields for equality
        return price == that.price && brand.equals(that.brand);
    }

    // Override the toString method from the Object class
    @Override
    public String toString() {
// Return a string representation of the Calculator object
        return "Calculator{" + "brand='" + brand + "', price=" + price + '}';
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
// Create a Calculator object with brand "Casio" and price 50
        Calculator calc1 = new Calculator("Casio", 50);

// Create another Calculator object with brand "Casio" and price 50
        Calculator calc2 = new Calculator("Casio", 50);

// Create a third Calculator object with brand "Texas Instruments" and price 75
        Calculator calc3 = new Calculator("Texas Instruments", 75);

// Compare calc1 and calc2 using the overridden equals method
        System.out.println(calc1.equals(calc2)); // Output: true

// Compare calc1 and calc3 using the overridden equals method
        System.out.println(calc1.equals(calc3)); // Output: false

// Print the string representation of calc1 using the overridden toString method
        System.out.println(calc1); // Output: Calculator{brand='Casio', price=50}

// Print the string representation of calc2 using the overridden toString method
        System.out.println(calc2); // Output: Calculator{brand='Casio', price=50}

// Print the string representation of calc3 using the overridden toString method
        System.out.println(calc3); // Output: Calculator{brand='Texas Instruments', price=75}
    }}
