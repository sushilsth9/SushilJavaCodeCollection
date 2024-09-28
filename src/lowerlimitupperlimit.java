
import java.util.Random;
import java.util.Scanner;

public class lowerlimitupperlimit {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lower Limit:");
        int lowerLimit = input.nextInt();
        System.out.println("Enter a upper Limit");
        int upperLimit = input.nextInt();
        // System.out.println(lowerLimit);
        // System.out.println(upperLimit);
        System.out.printf("here are the ten number generated between %d and %d\n",lowerLimit,upperLimit);

        for(int i=0;i<10;i++){
            int c= random.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit;



            System.out.println(c);
}
//        Random random=new Random();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a upper Limit:");
//        int upperLimit = input.nextInt();
//        System.out.println("Enter a lower Limit");
//        int lowerLimit = input.nextInt();
//        int c= random.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit;
//        int n=10;
//        System.out.printf("here are the ten number generated between %d and %d",lowerLimit,upperLimit);
//        System.out.println(lowerLimit);
//        System.out.println(upperLimit);
////        for(int i=0;i<n;i++){
////            System.out.println(c);
////        }




    }
}
