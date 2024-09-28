package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StatsInfoTest {public static void main(String[] args) {
    StatsInfo testData = new StatsInfo();
    // Typical testbench tests more
    //thoroughly
    System.out.println("Beginning tests.");
            // Check set/get num1
            testData.setNum1(100);
    if (testData.getNum1() != 100) {
        System.out.println(" FAILED set/get num1");
    }
    // Check set/get num2
    testData.setNum2(50);
    if (testData.getNum2() != 50) {
        System.out.println(" FAILED set/get num2");
    }
    // Check getAverage()
    testData.setNum1(10);
    testData.setNum2(20);
    if (testData.getAverage() != 15) {
        System.out.println(" FAILED GetAverage for 10, 20");
    }
    testData.setNum1(-10);
    testData.setNum2(0);
    if (testData.getAverage() != -5) {
        System.out.println(" FAILED GetAverage for -10, 0");
    }

    Scanner input=new Scanner(System.in);
    System.out.println("Enter a num1");
    int num1=input.nextInt();
    System.out.println("Enter a num2");
    int num2=input.nextInt();


    if(testData.sum(num1,num2)==(num1+num2)){
        System.out.println("passed");
    }
    else{
        System.out.println("failed");}




    System.out.println("Tests complete.");
}
}

