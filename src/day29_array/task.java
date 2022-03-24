package day29_array;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int spaceIndex = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");
        String middle = str.substring(spaceIndex +1, lastSpace + 1);
        System.out.println(middle);

    }
}
