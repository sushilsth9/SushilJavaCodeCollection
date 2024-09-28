package com.company;


import java.util.Scanner;

public class method_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter a 2nd number:");
        int num2 = input.nextInt();
        System.out.println("Enter a 3rd Number:");
        int num3 = input.nextInt();
        int ans = maxNumber(num1, num2, num3);
        System.out.println("The max of three number is:" + ans);


    }

    public static int maxNumber(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3)
            return num1;
        else if (num2 >= num1 && num2 >= num3)
            return num2;
        else
            return num3;



    }

}



