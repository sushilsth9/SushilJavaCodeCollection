package com.company;

public class Pattern4 {public static void main(String[] args) {
    int n=5;
    int row=1;
    int star=1;
    int space=n-1;

    while(row<=n){
        for (int i = 1; i <=space ; i++) {

            System.out.print("  ");

        }

        for (int i = 1; i <=star ; i++) {

            System.out.print("* ");

        }

        System.out.println();
        row++;
        star++;
        space--;}
}
}

