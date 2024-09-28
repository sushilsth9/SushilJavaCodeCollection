package com.company;

public class pattern03 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;

        while(row<=5){
            for(int i=1;i<=star;i++){
                System.out.print("* ");
            }
            row++;
            star--;
            System.out.println();
        }

    }
}
