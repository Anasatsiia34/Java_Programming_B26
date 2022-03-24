package day13_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of oxygen level");
        int oxygenLevel = input.nextInt();

        if(oxygenLevel>= 90){
            System.out.println("Your tank is full");
        }else if(oxygenLevel >= 80){
            System.out.println("Still okay");
        }else if( oxygenLevel>= 70){
            System.out.println("Don't go too far");
        }else if(oxygenLevel >= 60){
            System.out.println("Start to head back");
        }else if(oxygenLevel>= 50){
            System.out.println("Be careful now you at 50%");
        }

    }
}
