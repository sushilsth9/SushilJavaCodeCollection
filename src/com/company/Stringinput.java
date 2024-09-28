package com.company;

import java.util.Scanner;

public class Stringinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any message:");
        String str=input.nextLine();//for multiple words
        System.out.println(str);
    }
}
