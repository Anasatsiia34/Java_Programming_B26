package day09_scanner;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        int firstNumber = input.nextInt();

        System.out.println("Enter your second number ");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number ");
        int thirdNumber = input.nextInt();


        System.out.println( "Your sum is " + (firstNumber + secondNumber + thirdNumber));
    }
}
