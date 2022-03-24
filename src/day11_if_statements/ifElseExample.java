package day11_if_statements;

public class ifElseExample {
    public static void main(String[] args) {

       int score = 50;
       if(score >= 75) {
           System.out.println("Passing");
       }else{
           System.out.println("Failing");
       }

       int year = 2021;
       boolean lockdown = year == 2020 || year == 2021;

       if(lockdown)
       {
           System.out.println("Stay at home");
       } else {
           System.out.println("Travel");
       }
    }
}
