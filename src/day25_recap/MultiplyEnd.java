package day25_recap;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
        System.out.println("How many times do you want to repeat the ending");
        int repeat = input.nextInt();
        for(int i = 0; i < repeat; i++){
            str += str.charAt(str.length() -1);
        }

        System.out.println(str);







    }
}
