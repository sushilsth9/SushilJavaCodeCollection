package com.company;

class MathUtils{
    //Overloaded method :no parameters
    public int add (){
        return 0;
    }
    //Overloaded method :with one  parameters
    public int add (int a){
        return a;
    }

    //Overloaded method :With two parameters
    public int add(int a,int b){
        return a+b;
    }
    // Overloaded method :With three parameters
    public int add(int a,int b,int c){
        return a+b+c;
    }
    //Overloaded method



}

public class Main1 {
    public static void main(String[] args) {
        MathUtils utils = new MathUtils();

        System.out.println(utils.add());
        System.out.println(utils.add(5));
        System.out.println(utils.add(3,7));
    }
}
