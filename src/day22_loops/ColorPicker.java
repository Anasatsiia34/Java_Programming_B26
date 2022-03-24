package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int colorsPicked = 0;

        while(colorsPicked < 3){
            System.out.println("Enter your color");
            String color = input.next();
            colorsPicked++;
        }
        System.out.println("You picked: " + colorsPicked + " colors");


    }
}
