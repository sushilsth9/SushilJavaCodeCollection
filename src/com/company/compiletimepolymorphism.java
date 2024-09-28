package com.company;

import java.util.Scanner;//overloading

class Example{
    void display(int java){
        System.out.println("Arguments "+ java);
    }
    void display(int sushil,int shresth){
        System.out.println("Arguments "+ sushil +" and " +shresth);
    }
    void display(int a,int b,double c){
        System.out.println("argument " + a + " "+ b +" " + c);
    }
}
public class compiletimepolymorphism {
    public static void main(String[] args) {
        Example obj=new Example();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the argument for the first display method");
        int python=input.nextInt();
        obj.display(python);
        System.out.println("Enter the argument for the second display method");
        int abc=input.nextInt();
        int def =input.nextInt();//any interger name
        obj.display(abc,def);
        obj.display(10,20,30);
    }
}

