package com.company;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;

        while (row <= n) {
            for (int i = 1; i <= star; i++) {

                System.out.print("* ");

            }

            row++;
            star++;
            System.out.println();

        }

    }
}