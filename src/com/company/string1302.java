package com.company;

import java.util.Scanner;

public class string1302 {
    public static void main(String[] args) {
        Scanner Scr = new Scanner(System.in);
        String firstname;
        String lastname;

        System.out.println("Please enter your first name:");
        firstname = Scr.next();

        System.out.println("Please enter your second name:");
        lastname = Scr.next();
        System.out.println(lastname + ", " + firstname);
    }
}
