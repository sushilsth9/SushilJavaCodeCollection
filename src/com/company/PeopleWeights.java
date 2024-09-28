package com.company;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PeopleWeights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_VALS = 5;
        double[] Weight = new double[NUM_VALS];
        int i;
        for (i = 0; i < Weight.length; ++i) {
            System.out.print("Enter weight "+(i+1)+": ");
            Weight[i] = input.nextDouble();
        }
        for (i=0;i<Weight.length;++i){
            System.out.print(Weight[i]+"  ");
        }
        System.out.println();

        double totalweight =0;
        for (i=0;i<Weight.length;++i){
            totalweight =totalweight +Weight[i];
        }
        System.out.println("Total Weight:"+ totalweight);
        System.out.println("Average Weight:"+(totalweight/NUM_VALS));

        double MaxWeight =0;
        for(i=0;i<Weight.length;++i){
            MaxWeight=Math.max(Weight[i],MaxWeight);

        }
        System.out.println("Max Weight is :"+ MaxWeight);


        }






    }



