
import java.sql.SQLOutput;
import java.util.Scanner;


public class simplecalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to simple calculator");
        System.out.println("What operation you want to perform");
        System.out.println("Please select desired character");

        System.out.println("+,-,*,/");

        char ch=input.next().charAt(0);

        System.out.println("Enter a first number:");
        Double num1 = input.nextDouble();

        System.out.println("Enter a second number:");
        Double num2 = input.nextDouble();

        Double result;
        if(ch=='+'){
            result=num1+num2;
            System.out.println(result);
        } else if (ch=='-') {
            result=num1-num2;
            System.out.println(result);
            
        } else if (ch=='*') {
            result=num1*num2;
            System.out.println(result);
        } else if (ch=='/') {
            result=num1/num2;
            System.out.println(result);

        }else{
            System.out.println("Invalid character");
        }


    }
}



