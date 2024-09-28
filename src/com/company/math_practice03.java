package com.company;

import java.util.Scanner;

//z=2^(x^y+1)
public class math_practice03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double z;
        System.out.println("Enter a value of x:");
        x = input.nextDouble();
        System.out.println("Enter a value of y:");
        y = input.nextDouble();
        z = Math.pow(2, Math.pow(x, y) + 1);
        System.out.println("The Final of z is:"
        +z);

    }
}
