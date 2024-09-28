package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


public class EmployeeManager {
    static Scanner Scnr = new Scanner(System.in);
    public static void main(String[] args) {

            final int MAX_ELEMENTS = 10;//final makes it constant
            final char EXIT_CODE = 'X';
            final String PROMPT_ACTION = "Add, Delete, List or exit";
            ArrayList<String> name = new ArrayList<String>();
            ArrayList<String> department = new ArrayList<String>();
            ArrayList<String> title = new ArrayList<String>();
            char userAction;
            //loop until the user enter the exit code;
        do{
            userAction = getAction(PROMPT_ACTION);
            switch(userAction){
                case 'A': addEmployee(name,department,title);
                break;
                case 'D': deleteEmployee(name,department,title);
                break;
                case'L':listEmployee(name,department,title);
                break;
                case'X':
                    System.out.println("Exit");
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }
        while(userAction!=EXIT_CODE);
    }
    public static  char getAction(String PROMPT_ACTION){
        System.out.println(PROMPT_ACTION);
        return Scnr.next().charAt(0);
    }
    public static void addEmployee(ArrayList<String>name,ArrayList<String>department,ArrayList<String>title){
        System.out.println("Enter the name:");
        name.add(Scnr.next());
        System.out.println("Enter the Department:");
        department.add(Scnr.next());
        System.out.println("Enter the tittle:");
        title.add(Scnr.next());

    }
    public static void deleteEmployee(ArrayList<String>name,ArrayList<String>department,ArrayList<String>title){
        System.out.println("Enter the name to delete:");
        String namedelete= Scnr.next();
        int index = name.indexOf(namedelete);
        if (index != -1){
            name.remove(index);
            department.remove(index);
            title.remove(index);
            System.out.println("Employee deleted");
        }
        else {
            System.out.println("Employee not found");
        }
    }
    public static void  listEmployee(ArrayList<String>name,ArrayList<String>department,ArrayList<String>title){
        System.out.println("Employee list");
        for(int i =0;i<name.size();i++){
            System.out.println("name:"+name.get(i)+"Department:"+department.get(i)+"Tittle "+title.get(i));
        }
    }

}
