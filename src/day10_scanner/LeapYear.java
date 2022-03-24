package day10_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter a year ");
        int year = input.nextInt();

        boolean num2 = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0);



    }
}
