package com.company;

import java.util.Scanner;

public class practice_add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        while(true){
            System.out.println(" Enter a number until 0 to break:");
            int num = input.nextInt();
            if(num==0){
                System.out.println("exit");
                break;

            }
            sum+=num;
            System.out.println(sum+"sum so far");


        }
        System.out.println("Final sum is"+sum);

    }
}
