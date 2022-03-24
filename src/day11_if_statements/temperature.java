package day11_if_statements;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please, enter your temperature");
        int temperature = input.nextInt();
        if(temperature >= 70){
            System.out.println("It's a nice day. go outside, but with your laptop to code java");
        }else{
            System.out.println("It's too cold, code java at home");
        }

    }
}
