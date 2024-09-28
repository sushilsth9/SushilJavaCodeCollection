package com.company;

import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter any number:");
        String str =input.nextLine();
        System.out.println("please enter any other number:");
        String str1 =input.nextLine();
        // after taking both of string input we will typecast string into integer
        //int num1=Integer.parseInt(str);
        //int num2=Integer.parseInt(str1);
        System.out.println(Integer.parseInt(str)+Integer.parseInt(str1));

    }
}
