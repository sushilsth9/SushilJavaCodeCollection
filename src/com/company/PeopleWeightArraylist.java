package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleWeightArraylist {
    public static void main(String[] args) {
        ArrayList<Double>list= new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter a Weight"+(i+1)+":");
            double d =input.nextDouble();
            list.add(d);
        }
        for(int i=0;i<num;i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        double totalweight =0;
        for(int i=0;i<num;i++){
            totalweight =totalweight+list.get(i);
        }
        System.out.println("Total Weight: "+totalweight);
        System.out.println("Average Weight: "+(totalweight/num));


        double MaxWeight=0;
        for(int i=0;i<num;i++){
            MaxWeight=Math.max(MaxWeight,list.get(i));

        }
        System.out.println("The maximum weight is :"+ MaxWeight);



    }
}
