package com.company;

import java.util.Scanner;

//write different java methods to calculate areas of 1 .square 2.rectangle 3.trapezoid 4.circle 5.triangle
public class mathod_areas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of square:");
        double l = input.nextDouble();

        System.out.println("The area of given square is :"+ squareArea(l));


    }

    public static double squareArea(double l) {
        return l*l;


    }


}
