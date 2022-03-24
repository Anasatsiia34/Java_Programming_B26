package day16_review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter minutes");
        int minutes = input.nextInt();

        if (minutes < 0 && minutes > 90) {
            if (minutes < 0) {
                System.out.println("Minuted cannot be a negative number");
            } else if (minutes > 90) {
                System.out.println("Games cannot be longer than 90 minutes");
            }
        }
                if (minutes < 59 && minutes > 75) {
                    System.out.println("Just getting started");
                }else if (minutes < 74 && minutes > 60) {
                    System.out.println("Players are doing their best");
                }else if (minutes < 59 && minutes > 30) {
                    System.out.println("Middle of the game is going great");
                }else if (minutes < 29 && minutes > 0){
                        System.out.println("The end of the game is approaching");
                }

            }

        }

