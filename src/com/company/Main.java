package com.company;

public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.name="sushil";
        obj.EmployeeId=123;
        obj.Department="Software department";
        obj.Salary =100000;
        obj.displayInfo();
        //changing department and salary of the employee
        obj.Department="IT";
        obj.Salary=200000;
        System.out.println("after department and salary update ");
        obj.displayInfo();

    }
}
    class Employee {
    public String name;
    public int EmployeeId;
    public String Department;
    public int Salary;
    public void displayInfo() {
        System.out.println("EmployeeId is " + EmployeeId);
        System.out.println("Employee name is " + name);
        System.out.println("Department is " + Department);
        System.out.println("Salary is " + Salary);

    }

}
