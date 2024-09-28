package com.company;

import java.util.Scanner;

public class method_java2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a number:");
        int a= input.nextInt();
        System.out.println("Enter a another number:");
        int b= input.nextInt();
        sum (a,b);

    }
    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);

    }
}
