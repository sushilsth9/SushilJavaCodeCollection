package com.company;

public class student {
    String name;
    int age;
    String grade;
    int Id;
    public void diplaystudentinfo(){
        System.out.println("the name of the student is " +name);
        System.out.println("the age of the student is "+ age);
        System.out.println("the grade of the student is "+ grade);
        System.out.println("the id of the student is "+ Id);

    }
    public void updateGrade(String Newgrade){
        grade=Newgrade;
        System.out.println("updated grade is:"+grade);

    }

}
