package day19_String;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.next().toUpperCase();
        System.out.println("Please enter your last name");
        String lastName = input.next().toUpperCase();
        char first = name.charAt(0);
char second= lastName.charAt(0);
        System.out.println("Your initials is " + first + second);


    }
}
