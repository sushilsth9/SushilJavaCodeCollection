package com.company;

import java.util.Scanner;

import static com.company.Java_Method22.something;
//Returning and non parameterized
public class Method_area_circle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a radius:");
        double r = input.nextDouble();

        System.out.println("the area of the given circle is:" + areacircle(r));


    }
    public static double areacircle(double r){
        return Math.PI*r*r;

    }



    }

