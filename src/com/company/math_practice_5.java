package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
//Distance=Sqrt(x2-x1)^2+(y2-y1)^2
public class math_practice_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x2;
        double x1;
        double y2;
        double y1;
        System.out.println("Enter the value of x2:");
        x2=input.nextDouble();
        System.out.println("Enter the value of x1:");
        x1=input.nextDouble();
        System.out.println("Enter the value of y2:");
        y2 = input.nextDouble();
        System.out.println("Enter the value of Y1");
        y1=input.nextDouble();
        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The final value of distance"+d);
    }
}
