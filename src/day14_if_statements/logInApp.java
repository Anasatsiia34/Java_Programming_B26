package day14_if_statements;

import java.util.Scanner;

public class logInApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pin code");
        int pinCode = input.nextInt();
        System.out.println("Enter your SSN");
        int SSN = input.nextInt();
        int expectedPinCode = 1552;
        int ExpectedSSN = 1234;
        if(pinCode ==  expectedPinCode && SSN == ExpectedSSN){
            System.out.println("Authentification successful");
        }else if(pinCode != expectedPinCode && SSN != ExpectedSSN){
            System.out.println("Authentification failed");
        }if(pinCode != expectedPinCode){
            System.out.println("Pin Code is not correct");
        }if(SSN != ExpectedSSN){
            System.out.println("SSN is not correct");
        }

    }
}
