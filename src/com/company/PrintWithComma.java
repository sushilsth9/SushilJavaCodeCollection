package com.company;

import java.util.Scanner;

public class PrintWithComma {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int NUM_VALS = 4;
        int[] hourlyTemp = new int[NUM_VALS];
        int i;
        for (i = 0; i < hourlyTemp.length; ++i) {
            hourlyTemp[i] = scnr.nextInt();
        }

        for (i=0;i<hourlyTemp.length-1;++i){
            System.out.print(hourlyTemp[i]+", ");
        }
        System.out.println(hourlyTemp[i]);

    }
}
