package com.company;
//// WAP that take user input for upper and lower limit then print all the odd number between that limit in reverse order

import java.sql.SQLOutput;
import java.util.Scanner;

public class odd_number_reverseorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lower limit:");
        int lowerlimit = input.nextInt();
        System.out.println("Enter a upper Limit:");
        int upperlimit = input.nextInt();
        for (int i = upperlimit; i >= lowerlimit; i--) {
            if (i % 2 == 1)
                System.out.println(i);

        }

    }
}
