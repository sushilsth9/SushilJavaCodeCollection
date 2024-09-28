package com.company;



import java.util.Scanner;

public class PetApplicationBag {

    public static void main(String[] args) {
        // Initialize variables for available spaces
        int dogSpaces = 30; // Available spaces for dogs
        int catSpaces = 12; // Available spaces for cats
        Scanner input = new Scanner(System.in); // Scanner for input

        while (true) { // Loop until user chooses to exit
            System.out.println("Select an option: 1. Check-In Pet 2. Exit");
            int choice = input.nextInt(); // Read user's choice
            input.nextLine(); // Consume newline

            if (choice == 1) { // Pet Check-In
                // Step: Determine pet type and check for boarding space
                System.out.println("Enter Pet Type (Dog or Cat):");
                String petType = input.nextLine();

                if (petType.equalsIgnoreCase("Dog") && dogSpaces > 0) {
                    // If pet is a dog and space is available
                    dogSpaces--; // Assign the pet to a space
                    System.out.println("Dog checked in successfully. Remaining dog spaces: " + dogSpaces);

                    // Step: Gather information on the length of the stay
                    System.out.println("Enter Length of Stay (days):");
                    int daysStay = input.nextInt();
                    input.nextLine(); // Consume newline

                    // Step: Determine if grooming is needed for dogs staying 2 or more days
                    if (daysStay >= 2) {
                        System.out.println("Do you want your dog to be groomed? (yes/no): ");
                        String groomingInput = input.nextLine();
                        if (groomingInput.equalsIgnoreCase("yes")) {
                            System.out.println("Your dog has been groomed.");
                        }
                    } else {
                        System.out.println("Sorry, for grooming stay must be at least 2 days.");
                    }

                } else if (petType.equalsIgnoreCase("Cat") && catSpaces > 0) {
                    // If pet is a cat and space is available
                    catSpaces--; // Assign the pet to a space
                    System.out.println("Cat checked in successfully. Remaining cat spaces: " + catSpaces);
                } else {
                    // If no space is available or invalid input
                    System.out.println("No space available for " + petType + "s or invalid input.");
                }

            } else if (choice == 2) { // Exit the system
                System.out.println("Exiting the system. Goodbye!");
                break; // Exit the loop
            } else {
                // Invalid menu option
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        input.close(); // Close the scanner
         }
}
