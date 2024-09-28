package com.company;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        person obj = new person("sushil");
        obj.display_info();

    }

}

class person{
    private String name;//instance variable access throughout the class
    private int age;
    person(String name,int age)// local variable access only in this class and this is the constructor
     {this.name =name;
      this.age=age;
     }
     person(){
         System.out.println("this is the default constructor");

     }
     person(String name){
        this.name=name;
     }

 //method to display persons details:

 void display_info(){
     System.out.println("name is "+name);
     System.out.println("age is "+ age);

    }



}
