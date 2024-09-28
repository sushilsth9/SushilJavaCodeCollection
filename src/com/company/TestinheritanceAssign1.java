package com.company;


class person1 {
    //Data members
    private String name;
    private int age;

    //constructor
    person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method
    public void introduce() {
        System.out.println("Hello,my name is " + name + "and I am " + age + "years old.");
    }

    //setters and getters
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
}

class Employee568 extends person1 {

    //Data member
    private int EmployeeId;
    private String department;

    //constructor
    Employee568(String name, int age, int EmployeeId, String department) {
        super(name, age);
        this.EmployeeId = EmployeeId;
        this.department = department;
    }

    //method
    public void work() {
        System.out.println(getname() + " is working in the" + department + "department");
    }

    //Setter and getters

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeID(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

}

class Manager123 extends Employee568 {
    //data members
    private int teamSize;

    //Constructor
    Manager123(String name, int age, int EmployeeId, String department, int teamSize) {
        super(name, age, EmployeeId, department);
        this.teamSize = teamSize;
    }
    //- Methods: manage(): Prints "[name] is managing a team of [teamSize] people in
    //the[department] department.

    public void manage() {
        System.out.println(getname() + "is managing a team of " + teamSize + "people in the" + getdepartment() + "department");

    }
    //setter and getters

    public int getteamSize() {
        return teamSize;
    }

    public void setteamSize(int teamSize) {
        this.teamSize = teamSize;


    }}


    public class TestinheritanceAssign1 {
        public static void main(String[] args) {

            person1 obj = new person1("ram", 30);
            obj.introduce();
            obj.setname("shyam");
            System.out.println(obj.getname());
            obj.setage(30);
            System.out.println(obj.getage());

            Employee568 obj1 = new Employee568("Mark", 40, 3438, "finance");
            obj1.work();
            obj1.setEmployeeID(1234);
            System.out.println(obj1.getEmployeeId());
            obj1.setdepartment("account");
            System.out.println(obj1.getdepartment());

            Manager123 obj2 = new Manager123("Mike", 45, 5668, "It", 10);
            obj2.manage();
            obj2.setteamSize(5);
            System.out.println(obj2.getteamSize());

        }

    }











