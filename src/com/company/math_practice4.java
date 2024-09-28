package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
//z=sqrt(z*y)
public class math_practice4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double z;
        double x;
        double y;
        System.out.println("Enter the value of x:");
        x=input.nextDouble();
        System.out.println("Enter the value of Y:");
        y=input.nextDouble();
        z=Math.sqrt(x*y);
        System.out.println("The value of z:"+z);


    }
}
