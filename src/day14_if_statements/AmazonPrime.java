package day14_if_statements;

import java.util.Scanner;

public class AmazonPrime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your price and true of false for the prime");
        double price = input.nextDouble();
        boolean hasPrime = input.nextBoolean();

        if(hasPrime){

            System.out.println("Eligible for 2 day shipping");
        }else{
            if(price>= 25) {
                System.out.println("Eligible for regular free shipping");

            } else{
                System.out.println("Not eligible for regular free shipping. Shipping fee : 3.99");
            }
        }


    }
}
