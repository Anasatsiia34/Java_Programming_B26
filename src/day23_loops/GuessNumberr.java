package day23_loops;

import java.util.Scanner;

public class GuessNumberr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 80;

        int guess;

        do{
            System.out.println("Guess a number 1-100");
            guess = input.nextInt();

            if(guess > secretNumber){
                System.out.println(guess + " is to high");
            }else if(guess < secretNumber){
                System.out.println(guess + " is too low");
            }

        }while(guess != secretNumber);
        System.out.println("You guessed correct");



    }
}
