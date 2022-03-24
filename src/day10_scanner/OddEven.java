package day10_scanner;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter your number ");
        int number = input.nextInt();

        boolean even = number % 2 == 0;
        boolean odd = number %2 != 0;

        System.out.println(" Your number is even: " + even);
        System.out.println(" Your number is odd: "+ odd);



    }
}
