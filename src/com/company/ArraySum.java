package com.company;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 8;
        int [] courseGrades = new int[NUM_VALS];
        int i;
        for (i = 0; i < courseGrades.length; ++i) {
            courseGrades[i] = scnr.nextInt();
        }
        for(i=0;i<courseGrades.length;++i){
            if (courseGrades[i]>21){
                System.out.println(courseGrades[i]);
            }


        }


    }
}
