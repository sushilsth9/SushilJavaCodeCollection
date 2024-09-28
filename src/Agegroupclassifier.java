import java.util.Scanner;

public class Agegroupclassifier {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a age group:");
        int age = input.nextInt();
        if (age<=12)
            System.out.println("child");
        else if (age <= 19)
            System.out.println("Teen");
        else if (age<=64)
            System.out.println("Adult");
        else
            System.out.println("senior");







    }
}
