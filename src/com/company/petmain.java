package com.company;

import java.util.Scanner;

public class petmain {
    public static void main(String[] args) {
        pet1 obj=new pet1();
        System.out.println("Enter the Pet Type(dog or cat)");
        Scanner input =new Scanner(System.in);
        obj.petType= input.nextLine();
        System.out.println("Enter a pet name:");
        obj.petName=input.nextLine();
        System.out.println("Enter a pet age");
        obj.petAge=input.nextInt();
        System.out.println("number of days the pet will stay:");
        obj.daysStay =input.nextInt();
        obj.checkInPet();
        System.out.println("Ready to check out pet:");
        obj.checkOutPet();

    }
}
