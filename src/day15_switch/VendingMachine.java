package day15_switch;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the vending machine. Please select one of the following: \n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();

        switch (selection){
            case "Drinks":
                System.out.println("You choose drinks: press a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if(drinkNumber ==1){
                    System.out.println("vending out water.");
                }else if(drinkNumber ==2 ){
                    System.out.println("Vending out Soda");
                }else if(drinkNumber ==3){
                    System.out.println("Vending out Juice");
                }else{
                    System.out.println("Invalid number");
                }
                break;
            case "Snacks":
                System.out.println("You choose Snacks. Please pick a number:\n\t1) Candy\n\t2) Chips\n\t3) Chocolate");
                int SnackNumber = input.nextInt();
                if(SnackNumber ==1){
                    System.out.println("Vending out Candy");
                }else if(SnackNumber == 2 ){
                    System.out.println("Vending out Chips");
                }else if(SnackNumber ==3){
                    System.out.println("Vending out Chocolate");
                }else{
                    System.out.println("Invalid number");
                }
break;
            case "Gum":
                System.out.println("You choose Gum. Please pick a number:\n\t1) Strawberry\n\t2) Blueberry\n\t3) Watermelon");
                int gumNumber = input.nextInt();
                if(gumNumber==1){
                    System.out.println("Vending out Strawberry gum");
                }else if(gumNumber==2){
                    System.out.println("Vending out Blueberry gum");
                }else if( gumNumber ==3 ){
                    System.out.println("Vending out Watermelon gum");
                }else{
                    System.out.println("Invalid number");
                }
                break;
        }



    }
}
