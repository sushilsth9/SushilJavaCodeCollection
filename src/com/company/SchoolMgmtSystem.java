package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SchoolMgmtSystem {//production class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        student obj=new student();
        System.out.println("please enter the update marks of the student:");
        String updategrade=input.next();
        obj.updateGrade(updategrade);
        System.out.println("Enter the name of the student:");
        obj.name =input.next();
        System.out.println("Enter the age of the student:");
        obj.age=input.nextInt();
        System.out.println("Enter the grade of the student:");
        obj.grade=input.next();
        System.out.println("Enter the ID of the student:");
        obj.Id = input.nextInt();
        obj.diplaystudentinfo();

        Teacher obj1 = new Teacher();
        System.out.println("Enter the name of the Teacher:");
        obj1.name=input.next();
        System.out.println("Enter the subject of the Teacher:");
        obj1.subject=input.next();
        System.out.println("Enter the Id of the Teacher:");
        obj1.ID =input.nextInt();
        obj1.displayteacherinfo();

        Course obj2= new Course();
        System.out.println("enter the name of the course:");
        obj2.name= input.next();
        System.out.println("enter the code of the course:");
        obj2.code=input.next();
        System.out.println("enter the credit of the course:");
        obj2.credit=input.nextInt();
        obj2.displayCourseinfo();

        Classroom obj3 = new Classroom();
        System.out.println("enter the number of the class:");
        obj3.Number = input.nextInt();
        System.out.println("enter the capacity of the class:");
        obj3.Capacity =input.nextInt();
        obj3.displayclassroominfo();

        Admin obj4 = new Admin();
        System.out.println("Enter the name of the admin:");
        obj4.name=input.next();
        System.out.println("Enter the Id of the admin: ");
        obj4.Id=input.nextInt();
        obj4.displayAdmininfo();

        school obj5=new school();
        System.out.println("enter the name of the school:");
        obj5.name= input.next();
        System.out.println("enter the address of the school:");
        obj5.Address =input.next();
        obj5.displayschoolinfo();










    }
}
