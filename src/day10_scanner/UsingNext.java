package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" What is today's date?");
        String day = input.nextLine();

        System.out.println(" Enter your first name");
        String firstName = input.next();

        System.out.println(" Enter your last name");
        String lastName = input.next();

        System.out.println("Today is " + day);
        System.out.println(" First name " + firstName);
        System.out.println("Last name " + lastName);

        System.out.println("What is your address? ");

        input.nextLine();
        String address = input.nextLine();
        System.out.println("Adress " + address);

    }
}
