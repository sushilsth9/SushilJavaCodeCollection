package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckInPet {
    public static void main(String[] args) {
        String petType;
        String petName;
        int petAge;
        int daysStay;
        double amountDue;
        int dogSpaces = 30;
        int catSpaces = 12;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Pet Type:");
        petType = input.nextLine();

        System.out.println("Enter a Pet Name:");
        petName = input.nextLine();


            if (petType.equalsIgnoreCase("Dog")) {
                System.out.println("Enter a dog Space");
                dogSpaces = input.nextInt();
                if (dogSpaces > 0) {
                    dogSpaces--;
                    System.out.println("Dog checked in: " + petName);
                } else {
                    System.out.println("No space for dogs.");
                }

            } else if (petType.equalsIgnoreCase("Cat")) {
                System.out.println("Enter a Cat Space");
                catSpaces = input.nextInt();
                if (catSpaces > 0) {
                    catSpaces--;
                    System.out.println("Cat checked in: " + petName);
                } else {
                    System.out.println("No space for cats.");
                }

            }
        }

    }
