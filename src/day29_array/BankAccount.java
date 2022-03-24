package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String [] name1 = {"Ana Afaa", "saving", "123456", "$24_000"};
        System.out.println(Arrays.toString(name1));

        String [] name2 = new String[4];
        System.out.println(Arrays.toString(name2));
        name2[0] = " Jamie Fox";
        name2[1] = "Savings";
        name2[2] = "12357859";
        name2[3] = "10203";
        System.out.println(Arrays.toString(name2));

        String [] name3 = new String[4];
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        name3[0] = firstName;
        System.out.println("Enter your account type");
        name3[1] = input.nextLine();
        System.out.println("Enter your account number");
        name3[2] = input.nextLine();
        System.out.println("Enter your balance");
        name3 [3] = input.nextLine();


        String [] name4 = new String[4];
        String[] questions = {"full name", "account type", "account number", "balance"};

        for(int i = 0; i < name4.length; i++){
            System.out.println("Enter your " + questions[i]);
            name4[i] = input.nextLine();
        }

    }
}
