package com.company;

import org.w3c.dom.ls.LSOutput;

class Employee1{
    private String name;
    private int Id;
    private double salary;
    private String department;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int ID){
        this.Id=Id;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public void setdepartment(String department){
        this.department=department;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }
    public double getsalary(){
        return salary;
    }
    public String getdepartment(){
        return department;
    }



}
public class SetterAndGetter1 {
    public static void main(String[] args) {
        Employee1 obj=new Employee1();
        obj.setName("sushil");
        System.out.println(obj.getName());
        obj.setsalary(234);
        System.out.println(obj.getsalary());
        obj.setId(123);
        System.out.println(obj.getId());
        obj.setdepartment("account");
        System.out.println(obj.getdepartment());
        //double ans=AnnualSalary(obj.getsalary());
        System.out.println("the annual Salary is " + AnnualSalary(obj.getsalary()));




    }
    public static double AnnualSalary(double salary){

        return 12*salary;
    }

}


