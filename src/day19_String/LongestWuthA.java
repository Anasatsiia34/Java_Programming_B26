package day19_String;

import java.util.Locale;
import java.util.Scanner;

public class LongestWuthA{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        if (wordOne.contains("a") && wordOne.length() > wordTwo.length() && wordOne.length() > wordThree.length()) {

            System.out.println(wordOne + "is the longest with a");
        }else if (wordTwo.contains("a") && wordTwo.length() > wordOne.length() && wordTwo.length() > wordThree.length()) {

     System.out.println(wordTwo + " is the longest with a");
 } else if (wordThree.contains("a") && wordThree.length() > wordOne.length() && wordThree.length() > wordTwo.length()) {

            System.out.println(wordThree + " is the longest with a");

        }else{
            System.out.println("No largest word with a");
        }



    }

}