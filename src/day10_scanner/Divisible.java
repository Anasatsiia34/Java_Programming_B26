package day10_scanner;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        System.out.println(num + " is divisible by 2; " + by2);
        System.out.println(num + " is divisible by 3; " + by3);
        System.out.println(num + " is divisible by 5; " + by5);

    }
}
