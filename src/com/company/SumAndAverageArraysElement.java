package com.company;

import java.util.Scanner;

public class SumAndAverageArraysElement {public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    final int NUM_VALS = 4;
    int [] courseGrades = new int[NUM_VALS];
    int i;
    for (i = 0; i < courseGrades.length; ++i) {
        courseGrades[i] = scnr.nextInt();
    }
    int sum=0;
    double average=0;
    for(i=0;i<courseGrades.length;++i){
        sum=sum+courseGrades[i];


    }
    System.out.println(sum);
    average =(double) sum/courseGrades.length;//Type casting
    System.out.println(average);



}
}
