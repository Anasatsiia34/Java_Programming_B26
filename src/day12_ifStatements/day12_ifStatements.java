package day12_ifStatements;

import java.sql.SQLOutput;

public class day12_ifStatements {
    public static void main(String[] args) {

        double hourlyRate = 20.5;
        double hoursWorked = 44;
        double overTime = hoursWorked - 40;
        double overTime2 = overTime * (hourlyRate *1.5);
        if (hoursWorked > 40) {

            System.out.println("There is an overwork so your pay net will be " + (hourlyRate * 40 + overTime2 ));
        } else {
            System.out.println("There is no overwork so your net pay is " + (hourlyRate * hoursWorked));
        }
    }
}