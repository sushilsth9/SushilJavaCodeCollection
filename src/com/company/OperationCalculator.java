package com.company;

public class OperationCalculator {
    public static void main(String[] args) {
        int calc = calc(3,5 );
        System.out.println(calc);
        String calc1 =calc1 ("Hello","World");
        System.out.println(calc1);
        double calc2= calc2(1.2,3.4,5.6);
        System.out.println(calc2);
        int calc3=calc3(2,8,5,7);
        System.out.println(calc3);
    }
    public static int calc(int a,int b){
        return a+b;
    }
    public static String calc1(String a,String b){
        return a+b;
    }
    public static double calc2(double a,double b,double c){
        return a*b*c;
    }
    public static int calc3(int a,int b,int c,int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }

}
