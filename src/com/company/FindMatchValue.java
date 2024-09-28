package com.company;

import java.util.Scanner;

public class FindMatchValue {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        final int Num_Vals=4;
        int uservalues[]=new int[Num_Vals];
        int i;
        int matchValue;
        int numMatches=0;
       for(i=0;i<uservalues.length;i++){
           uservalues[i]=input.nextInt();
       }
        System.out.println("Enter the match value:");
       matchValue=input.nextInt();
       for(i=0;i<uservalues.length;i++){
           if (matchValue == uservalues[i]){
               numMatches++;
           }

       }
        System.out.println("Number of Matches : "+ numMatches);


    }
}
