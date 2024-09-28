package com.company;


import java.util.Scanner;

public class method_area_rectangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        double l=input.nextDouble();
        System.out.println("please enter the length of the rectangle:");
        double b = input.nextDouble();
        double areaRectangle= areaRectangle(l,b);
        System.out.println("The given area of the rectangle is " +areaRectangle);




    }
    public static double areaRectangle(double l,double b){
        return l*b;
    }

}
