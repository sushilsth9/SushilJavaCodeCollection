package com.company;

import java.util.Scanner;

public class StrngTesting {
    public static void main(String[] args) {
        System.out.println("This program validity of name sushil");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a name:");
        String name =input.nextLine();
        if(name.equalsIgnoreCase("Sushil")){
            System.out.println("User Enter Sushil name correctly");
        }
        else{
            System.out.println("user didn't enter Sushil");
        }
    }
}
