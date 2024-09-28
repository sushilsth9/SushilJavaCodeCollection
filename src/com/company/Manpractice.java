package com.company;

class man1 {
    //Data members
    private String name;
    private int age;


    //paramaterized constructor

    public man1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{name='" + name + "',age=" + age + "}";

    }

}

public class Manpractice {
    public static void main(String[] args) {
        man1 obj = new man1("sushil", 30);
        System.out.println(obj);
        System.out.println(obj.toString());
    }



}
