package com.company;

import java.util.Scanner;

public class DrawHalfArrow {
    public static void main(String[] args) {

            //create scanner object
            Scanner scnr = new Scanner(System.in);

            //declare variables
            int arrowBaseHeight;
            int arrowBaseWidth;
            int arrowHeadWidth;
            int i;
            int j;

            //get user input
            System.out.println("Enter arrow base height:");
            arrowBaseHeight = scnr.nextInt();

            //get user input
            System.out.println("Enter arrow base width:");
            arrowBaseWidth = scnr.nextInt();

            //get user input
            System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();

            //loop to continue prompting the user for an arrow head width until the value is larger than the arrow base width

            while(arrowHeadWidth<=arrowBaseWidth){
                //get user input
                System.out.println("Enter arrow head width:");
                arrowHeadWidth=scnr.nextInt();
            }
            System.out.println("");

            //Drawing a arrow base
            for(i=0;i<arrowBaseHeight;i++){
                for(j=0;j<arrowBaseWidth;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

            //Drawing a arrow head
            for(i=arrowHeadWidth;i>=1;--i){
                for(j=0;j<i;++j){
                    System.out.print("*");
                }
                System.out.println("");
            }


        }
    }



