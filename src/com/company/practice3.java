package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

//WAP that take lower limit and upper limit from the user and then print all even number between that limit
public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lower limit:");
        int lowernum = input.nextInt();
        System.out.println("Enter a upper limit");
        int uppernum =input.nextInt();

        for(int i=lowernum; i<=uppernum;++i)

        { if(i%2==0)
            System.out.println(i);
        }
    }
}

