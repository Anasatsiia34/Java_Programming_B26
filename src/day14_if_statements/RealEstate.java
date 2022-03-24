package day14_if_statements;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your budget?");
        double budget = input.nextDouble();

        if(budget >= 80000 && budget <= 100000){
           String name = "Hills";
           int averagePrice = 90000;
           double rating = 4;
           boolean gated = false;
           boolean allowPets = true;
            System.out.println(name + " " + averagePrice +  " " + rating + " " + gated + " " + allowPets);
        }else if (budget >= 55000 && budget <= 90000){
            String name2 = "Oaks";
            int averagePrice2 = 65000;
            double rating2 = 3.5;
            boolean gated2 = false;
            boolean allowPets2 = true;
            System.out.println(name2 + " " + averagePrice2 + " " + rating2 + " " + gated2 + " " + allowPets2);
        }else if( budget>= 120000 && budget <= 150000 ){
           String name3 = "Highland";
           int averagePrice3 = 135000;
           double rating3 = 4.5;
           boolean gated3 = true;
           boolean allowPets3 = false;
            System.out.println(name3 + " " + averagePrice3 + " " + rating3 + " " + gated3 + " " + allowPets3);
        }else if (budget >= 160000 && budget<= 201000){
           String name4 = "Canyon";
           int averagePrice4 = 180000;
           double rating4 = 4.8;
           boolean gated4 = true;
           boolean allowpets4 = true;
            System.out.println(name4 + " " + averagePrice4 + " " + rating4 + " " + gated4 + " " + allowpets4);
        }else{
            System.out.println(" No available houses");
        }


    }
}
