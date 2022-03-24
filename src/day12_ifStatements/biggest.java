package day12_ifStatements;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three numbers you want to compare");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if( num1 > num2 && num1 > num3){
            System.out.println("First number is biggest");
        }else if(num2 > num1 && num2>num3){
            System.out.println("Second number is biggest");
        }else if(num3 > num1 && num3 > num2){
            System.out.println("Third number is biggest");
        }

    }
}
