package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr =new Scanner(System.in);
        int userInt = 0;
        double userDouble =0.0;
        char userChar=0;
        String userName;
        System.out.print("Enter integer:");
        userInt =scnr.nextInt();
        System.out.print("Enter Double:");
        userDouble =scnr.nextDouble();
        System.out.print("Enter character:");
        userChar= scnr.next().charAt(0);
        System.out.print("Enter string:");
        userName=scnr.next();
        int castDoubleToInt=(int)userDouble;//Type casting

        System.out.println(userInt+" "+ userDouble+" "+userChar+" "+userName);
        System.out.printf("%s %c %.2f %d",userName,userChar,userDouble,userInt);
        System.out.println();
        System.out.println(userDouble+" cast to an integer is "+castDoubleToInt);//cdti enter


    }
}
