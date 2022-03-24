package day11_if_statements;

import java.sql.SQLOutput;

public class SingleIfExamples {
    public static void main(String[] args) {

        if(false) {
            System.out.println("Hello World");  // if statement is false so it does not print

        }

        System.out.println("Second line"); // just normal print statement, nothing to do with if statement

        if(true){
            System.out.println("Today is Monday");
        } // the if statement is true, so it will print this value

        int score = 60;
        if(score >= 75){
            System.out.println("Passing");
        }

        if(score < 75) {
            System.out.println("Failing");
        }


        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;
        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear a mask");
        }

        if(!lockdown){
            System.out.println("Party");
            System.out.println("Still practice java");
            System.out.println("Practice");
        }



    }
}
