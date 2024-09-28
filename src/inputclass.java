import java.util.Scanner;

public class inputclass {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");

        // steps to take input value
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        System.out.println("Age is " + age);

        input.close();
    }
}
