package day19_String;

import java.util.Scanner;

public class Website {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a url");
        String url = input.nextLine();

        System.out.println(url.substring(4, url.length()-4));




    }
}
