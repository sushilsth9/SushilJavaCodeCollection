import java.util.Scanner;

public class gradecommenter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter a number from 1-100:");
        int num=input.nextInt();
        if (num>75)
            System.out.println("excellent");
        else if(num >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");


    }
}
