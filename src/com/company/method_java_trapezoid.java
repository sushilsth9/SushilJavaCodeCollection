package com.company;

import java.util.Scanner;
// calculate the area of trapezoid
public class method_java_trapezoid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        double h = input.nextDouble();
        System.out.println("Please enter the base: ");
        double b = input.nextDouble();
        System.out.println("please enter the upper base:");
        double a =input.nextDouble();
        double ans = areaTrapezoid(a,b,h);
        System.out.println("The area of trapezoid is: "+ areaTrapezoid(a,b,h));


    }
    public static double areaTrapezoid(double a ,double b ,double h){
        return (0.5)*(a+b)*h;
    }

}
