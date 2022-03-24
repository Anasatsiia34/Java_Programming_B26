package day25_recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String sen = input.nextLine();
        String fixed = "";
        for ( int i = 0; i < sen.length(); i++){

            if(sen.charAt(i) == ' ') {
                fixed += "_ ";
            }else{
                fixed += sen.charAt(i) + " ";
            }

        }
        System.out.println(fixed);


    }
}
