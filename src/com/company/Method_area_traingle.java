package com.company;

import java.util.Scanner;


//non returning and parameterized

public class Method_area_traingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a base:");
        double b = input.nextDouble();
        System.out.println("Please enter a height:");
        double h = input.nextDouble();
         areaTriangle(b,h); //why red




    }
    public static void areaTriangle(double b,double h){
        double areaTriangle = 0.5*(b*h);
        System.out.println("The area of the traingle : "+ areaTriangle);



    }
}
