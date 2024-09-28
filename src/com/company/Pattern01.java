package com.company;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        System.out.println("Please enter a user input:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int row=1;
        int star=n;

        while(row<=n)
        {
            for(int i=1;i<=star;i++){
                System.out.print("* ");
            }
            row++;
            System.out.println();



        }

    }
}
