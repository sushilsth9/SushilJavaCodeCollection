package com.company;



class Employee123{
    //Data members
    String name;
    int age;
    String department;
    double salary;

    //constructor(why public is here?)because we can access anywhere but if we not put then also ok
    public Employee123(String name,int age,String department,double salary){
        this.name=name;
        this.age=age;
        this.department=department;
        this.salary=salary;
    }
     //Method
    public void work(){
        System.out.println(name +" is working");
    }

    //method
    public void getpaid(){
        System.out.println(name +" is getting paid");
    }
    //Method

    public void takebreak(){
        System.out.println(name+" is taking break");
    }

    //method
    public void displayInfo(){
        System.out.println("name is: "+name);
        System.out.println("Age is "+ age);
        System.out.println("Department is"+department);
        System.out.println("Salary is "+ salary);
    }

}

//Subclass or derived class or child class:Manager
class Manager1 extends Employee123 {
    //Additional data members
    private int teamSize;

    //constructor
    public Manager1(String name, int age, String department, double salary, int teamSize) {
        super(name, age, department, salary);// why it is here?
        this.teamSize = teamSize;
    }
    //overidemethod

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize);
    }

    @Override
    public void getpaid() {
        System.out.println(name + " is getting paid of" + salary + "extra bonus");
    }

    //Additional method

    public void conductmeeting() {

        System.out.println(name + " is conducting meeting");
    }

    @Override//why it is red?
    public void displayInfo() {
        super.displayInfo();//Why it is here
        System.out.println("Team size" + teamSize);
    }
}

class Developer extends Employee123{
    //additional data members
    String programmingLanguage;

    //constructor method
    Developer(String name,int age,String department,double salary,String programmingLanguage){
        super(name,age,department,salary);
        this.programmingLanguage=programmingLanguage;
    }






}


public class Main12 {
    public static void main(String[] args) {
        //Create Employee obj
        System.out.println("Parent Class Employee info:");
        Employee123 Emp= new Employee123("sushil",30,"finance",500000.00);
        Emp.work();
        Emp.getpaid();
        Emp.takebreak();
        Emp.displayInfo();

        System.out.println();

        //Create Manager  object
        System.out.println("Child class Manager Info:");
        Manager1 mgr=new Manager1("robi",29,"It",24000.00,6);
        mgr.work();
        mgr.getpaid();
        mgr.displayInfo();

        mgr.conductmeeting();

        //Create Developer object

        System.out.println("child class Developer info");
        Developer dev=new Developer("ram",21,"account",35000.0,"core language");







    }



}
