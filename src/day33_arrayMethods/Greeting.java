package day33_arrayMethods;

import java.util.Scanner;

public class Greeting {

    public static void hello(String name){
        System.out.println("Hello " + name + " , how are you doing?");

    }

    public static void main(String[] args) {
        hello("Ana");
        hello("Jamie");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        hello(name);
    }

}
