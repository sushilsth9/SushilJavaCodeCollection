package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Module1Assignment {
    public static void main(String[] args) {
        System.out.println("Welcome to pet check in:");
        Scanner input =new Scanner(System.in);
        String Dog;
        String Cat;



        System.out.println("Do you have Dog or cat");
        String dog=input.nextLine();


        System.out.println("How Many dog or cat you have:");
        int Dogspace=input.nextInt();
        if(Dogspace<=30){
            System.out.println("There are space for dog");
        }else{
            System.out.println("no space");

        }
        System.out.println("whats the length of stay");
        int length =input.nextInt();

        if (length>=2){
            System.out.println("Dog can be groomed");
        }
        else{
            System.out.println("Dogs can't be groomed");
        }
        System.out.println("Dog assigned to space");

        System.out.println("pet check out");
        String pet = input.nextLine();
        System.out.println("What pet you have");


        }

    }



