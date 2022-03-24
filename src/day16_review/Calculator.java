package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first nu,ber please");
        double num1 = input.nextDouble();
        System.out.println("Enter your : + - * / %");
        String operator = input.next();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        double result = 0;

        switch (operator){
            case"+":
               result = num1 + num2;
               break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":

                if(num2 == 0){
                    System.out.println("You can't divide by 0");
                }
                result = num1 / num2;
                break;
            case"%":
                result = num1 % num2;

        }

        System.out.println("Your result is " + result);

    }
}
