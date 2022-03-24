package day10_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RateCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please, enter your salary ");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work a week? ");
        int hours = input.nextInt();

        double hourlyRate = salary/ ( hours * 52);

        System.out.println(" Your hourly rate is: " + hourlyRate);
    }
}
