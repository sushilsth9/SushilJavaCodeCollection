package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        int copy = num;
        int r;

        int rev=0;
        while(num>0){
            r=num%10;
            rev = rev*10+r;
            num=num/10;

        }
        if (rev==copy){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


    }
}
