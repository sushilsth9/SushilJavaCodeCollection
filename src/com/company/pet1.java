package com.company;

// Pet.java
public class pet1 {
    String petType;
    String petName;
    int petAge;
    int daysStay;
    double amountDue;

     int dogSpaces = 30;
     int catSpaces = 12;

    // Method to calculate boarding fee
    public double calculateBoardingFee() {
        if (petType.equalsIgnoreCase("Dog")) {
            if (petAge >= 30) {
                return 34.00;
            } else if (petAge >= 20) {
                return 29.00;
            } else {
                return 24.00;
            }
        } else if (petType.equalsIgnoreCase("Cat")) {
            return 18.00;
        }
        return 0.0;
    }

    // Method to calculate grooming fee
    public double calculateGroomingFee() {
        if (petType.equalsIgnoreCase("Dog") && daysStay >= 2) {
            if (petAge >= 30) {
                return 29.95;
            } else if (petAge >= 20) {
                return 24.95;
            } else {
                return 19.95;
            }
        }
        return 0.0;
    }

    // Method to check in a pet
    public void checkInPet() {
        if (petType.equalsIgnoreCase("Dog")) {
            if (dogSpaces > 0) {
                dogSpaces--;
                System.out.println("Dog checked in: " + petName);
            } else {
                System.out.println("No space for dogs.");
            }
        } else if (petType.equalsIgnoreCase("Cat")) {
            if (catSpaces > 0) {
                catSpaces--;
                System.out.println("Cat checked in: " + petName);
            } else {
                System.out.println("No space for cats.");
            }
        }
    }

    // Method to check out a pet
    public void checkOutPet() {
        double boardingFee = calculateBoardingFee() * daysStay;
        double groomingFee = calculateGroomingFee();
        amountDue = boardingFee + groomingFee;

        if (petType.equalsIgnoreCase("Dog")) {
            dogSpaces++;
        } else if (petType.equalsIgnoreCase("Cat")) {
            catSpaces++;
        }

        System.out.println("Checked out " + petName + ". Total due: $" + amountDue);



}}