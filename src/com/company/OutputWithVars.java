package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OutputWithVars {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum =0;
        System.out.print("Enter integer:");
        userNum=scnr.nextInt();
        System.out.println("You entered: "+ userNum);

        int userNum1 =userNum*userNum;
        System.out.println(userNum +" squared is "+userNum1);

        int userNum2= userNum*userNum*userNum;
        System.out.println("And "+userNum+" cubed is "+userNum2+"! !");

        System.out.print("Enter another integer :");
        int userNum3=scnr.nextInt();

        System.out.println("4 + 5 is "+ userNum+userNum3 );
        System.out.println("4 * 5 is "+ userNum*userNum3 );


    }
}
