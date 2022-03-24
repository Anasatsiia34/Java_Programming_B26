package day11_if_statements;

import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How much money is in your account");
        double balance = input.nextDouble();
        System.out.println("How many you would like to withdraw? ");
        double withdraw = input.nextDouble();
        double left = balance - withdraw;
        if(withdraw > balance){
            System.out.println(" Not enough money on the account, overdraft fee of $5.99 is applied \n to your balance, current balance is :" + (balance - 5.99));
        }else{
            System.out.println("The withdrawal was successful amount of money left on the account is: " + left);
        }


    }
}
