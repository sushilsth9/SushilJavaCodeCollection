//package com.company;
//
//import java.util.Scanner;
//
//public class Printing_Array_Elements {
//    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        final int NUM_ELEMENTS = 5;
//
//        int [] runTimes = new int[NUM_ELEMENTS];
//        int i;
//        for (i = 0; i < runTimes.length; ++i) {
//            runTimes[i] = scnr.nextInt();
//        }
//        for (i=0;i<3;++i){
//            System.out.println(runTimes[i]);
//        }
//
//    }
// }

package com.company;

import java.util.Scanner;

public class Printing_Array_Elements{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int Num_Elements=5;
        int runtimes [] =new int [Num_Elements];
        int i;
        for(i=0;i<=runtimes.length;i++){
            runtimes[i] = scnr.nextInt();

        }
        for (i=0;i<=3;i++){
            System.out.println(runtimes[i]);
        }


    }

}

