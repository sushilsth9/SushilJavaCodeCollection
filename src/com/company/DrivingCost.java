package com.company;


import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a milesPer Gallon:");
        Double milesPerGallon = input.nextDouble();

        System.out.println("Enter a dollarsPerGallon:");
        Double dollarsPerGallon= input.nextDouble();

        System.out.println("Enter a MilesDriven");
        Double milesDriven = input.nextDouble();

        System.out.printf("The driving cost is "+ "%.2f",drivingCost(milesPerGallon,dollarsPerGallon,milesDriven));
    }
    public static double drivingCost(  double milesPerGallon, double dollarsPerGallon,double milesDriven ){
        return ((milesDriven/milesPerGallon)*dollarsPerGallon);

    }

}

