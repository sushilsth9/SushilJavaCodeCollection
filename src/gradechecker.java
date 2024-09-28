//write a java program to identify grade of student based on user input
// A: 90 to 100
//B: 80 to 89
//C: 70 to 79
//D: 60 to 69
//F: 0 to 59

import java.util.Scanner;

public class gradechecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a marks:");
        int marks =input.nextInt();
        if( marks >=90 )
            System.out.println("A");
        else if(marks >=80 )
            System.out.println("B");
        else if (marks>=70 )
            System.out.println("c");
        else if (marks>=60 )
            System.out.println("D");
        else
            System.out.println("F");



    }

}
