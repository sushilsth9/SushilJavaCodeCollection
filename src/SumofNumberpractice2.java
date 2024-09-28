//Sum of Numbers:* Create a Java program that asks the user to enter multiple numbers
//until a sentinel value (e.g., -1) is entered. The program should then output
//the sum of all entered numbers.

import java.util.Scanner;

public class SumofNumberpractice2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =input.nextInt();
        int sum=0;
        for(int i=0;i<=num;++i){
            sum+=1;
        }
        System.out.println(sum);
        input.close();




    }
}
