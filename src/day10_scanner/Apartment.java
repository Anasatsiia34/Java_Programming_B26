package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your address ");
        String address = input.nextLine();
        System.out.println(" What is the name of the owner? ");
        String nameOfOwner = input.nextLine();
        System.out.println("What is the number of units in the building? ");
        String units = input.nextLine();
        System.out.println("What is an average size of each unit? ");
        String sizrOfTheUnit = input.nextLine();
        System.out.println("What is the rent amount? ");
        int rentAmount = input.nextInt();
        System.out.println("How many washers and driers in the building? ");
        int washers = input.nextInt();
        int driers = input.nextInt();
        System.out.println("Are pets allowed? ");
        boolean pets = input.nextBoolean();
        System.out.println("Does it have a pool? ");
        boolean pool = input.nextBoolean();
        System.out.println("What is the lenght of lease in months? ");
        int lenght = input.nextInt();
        System.out.println(" Total number of residents in building? ");
        int residents = input.nextInt();
        System.out.println(" What is the phone number of the owner? ");
        String number = input.next();
        System.out.println("Is the gas station nearby? ");
        boolean gasStation = input.nextBoolean();
        System.out.println("How many floors is in the building? ");
        int floors = input.nextInt();
        System.out.println(" Does it have a basement? ");
        boolean basement = input.nextBoolean();
        System.out.println("Has available units for rent? ");
        boolean availableUnits = input.nextBoolean();
        System.out.println("Has air conditioning? ");
        boolean airConditioning = input.nextBoolean();
        System.out.println("Number of parking spaces ");
        int parkingSpaces = input.nextInt();
        System.out.println(" Has wheel chair access ");
        boolean wheelChair = input.nextBoolean();
        System.out.println("Number of review stars ");
        int stars = input.nextInt();

        double rateAfter3Years = rentAmount *0.9;




























































    }
}
