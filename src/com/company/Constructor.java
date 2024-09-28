package com.company;

 class ConstructorExample{
    // Constructor
    ConstructorExample(){
        System.out.println("This is the default constructor");
    }

    void showName(){
        System.out.println("My name is Sushil");
    }

}


    public class Constructor {
        public static void main(String[] args) {
            // Created an object of ConstructorExample class and its constructor is invoked automatically.
            ConstructorExample obj = new ConstructorExample();
            obj.showName();
        }
    }





