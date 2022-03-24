package day20_string;

import java.util.Scanner;

public class moveFirstWord {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("please enter your sentence");
        String sentence = input.nextLine().trim();

        int spaceIndex = sentence.indexOf(' ');

        String firstWord = sentence.substring(0, spaceIndex);

       String result = sentence.substring(spaceIndex +1);
        System.out.println(result + " " + firstWord);

String [] name4 = new String[4];
String[] questions = {"full name", "account type", "account number", "balance"};

for(int i = 0; i < name4.length; i++){
    System.out.println("Enter your " + questions[i]);
    name4[i] = input.nextLine();
}

    }
}
