package day10_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please' enter your product");
        String product = input.nextLine();
        System.out.println("Please, enter the price of the product ");
        double price = input.nextDouble();

        System.out.println("Please, enter the quantity of your product ");

        int quantity = input.nextInt();

        System.out.println("Please enter your full name ");
        String fullName = input.nextLine();
        String name1 = input.nextLine();

        double finalPrice = quantity * price;


        System.out.println( fullName + ", you order for " + quantity + " " + product + " has been placed. You total is $" + finalPrice );


    }
}
