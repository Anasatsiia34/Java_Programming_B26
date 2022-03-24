package day09_scanner;
import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number ");
        int firstNumber = input.nextInt();

        System.out.println("Please enter your second number ");
        int secondNumber = input.nextInt();
        System.out.println("The numbers are equal " + (firstNumber == secondNumber));


    }
}
