package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

// take input two different string from user  and concanete them
public class string_practice01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter any message:");
        String str =input.nextLine();
        System.out.println("please enter any other message:");
        String str1 =input.nextLine();
        System.out.println(str +str1);

    }
}
