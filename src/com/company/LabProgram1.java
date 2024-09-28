package com.company;

import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        //create scanner object
        Scanner scnr = new Scanner(System.in);

        //declare variables
        String userText;
        int i;
        int charCount;

        //get user input
        userText = scnr.nextLine();

        //declare variables
        charCount=0;


        // loop to countinput length without spaces, periods, exclamation points, or commas.
        for(i=0;i<userText.length();i++){
            if((userText.charAt(i)!=' ')&&(userText.charAt(i)!='.')&&(userText.charAt(i)!='!')&&(userText.charAt(i)!=','))
                charCount++;
        }
        // display result
        System.out.println(charCount);

    }
}
