package day15_switch;

import java.util.Scanner;

public class Starbuks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your size");
        String size = input.nextLine();

       double price;
       int calories;

       switch (size){
           case "Tall":
               price = 2.50;
               calories = 100;
               System.out.println("You ordered " + size + " there is " + calories + " calories and the price for you is $" + price);
               break;
           case "Grande":
               price = 4.00;
               calories = 150;
               System.out.println("You ordered " + size + " there is " + calories + " calories and the price for you is $" + price);
               break;
           case "Venti":
               price = 4.50;
               calories = 200;
               System.out.println("You ordered " + size + " there is " + calories + " calories and the price for you is $" + price);
           break;
           default:
               System.out.println("Invalid size");




       }




    }
}
