package day10_scanner;
import java.util.Scanner;
public class revenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter the price ");
        double price = input.nextDouble();

        System.out.println(" Please enter you quantity ");
        int quantity = input.nextInt();

        System.out.println(" Your revenue is " );

        double revenue = price * quantity;
        System.out.println(revenue);

    }
}
