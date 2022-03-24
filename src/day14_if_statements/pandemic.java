package day14_if_statements;

import java.util.Scanner;

public class pandemic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = input.nextInt();

        if( 1346< year && year < 1353){
            System.out.println("The Black Death");
        }else if(1665 < year && year < 1666){
            System.out.println("Great Plague of London");
        }else if(1770 < year && year < 1772){
            System.out.println("Russian plague");
        }else if(year == 1916){
            System.out.println("American Polio Epidemic");
        }else if(1918 < year && year< 1920){
            System.out.println("Spanish Flu");
        }else if(2009 < year && year< 2010){
            System.out.println("H1N1 Swine Flu pandemic");
        }else if( 2014< year && year< 2016){
            System.out.println("West Swine Ebola epidemic");
        }else if( 2020<year && year< 2021){
            System.out.println("COVID-19");
        }else
            System.out.println("No pandemic");

    }
}
