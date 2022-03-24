package day10_scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angle numbers ");
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        boolean isTriangle = angleOne + angleThree + angleTwo == 180;

        System.out.println(" Is it a triangle: " + isTriangle);

        boolean isCircle = angleOne + angleTwo + angleThree == 360;
        System.out.println(" Is it a circle: " + isCircle);


    }
}
