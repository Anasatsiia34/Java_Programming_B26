package day15_switch;

import java.util.Scanner;

public class ArmyQualify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean citizenship = input.nextBoolean();
        System.out.println("Are you a resident?");
        boolean resident = input.nextBoolean();
        System.out.println("Do you have a High School Diploma?");
        boolean hasHighSchoolDiploma = input.nextBoolean();
        System.out.println("How old are you?");
        int age = input.nextInt();

        if (citizenship || resident) {

            if (age >= 18 && age <= 35)

                if (hasHighSchoolDiploma)
                    System.out.println("You are qualified for the Army");
        } else {

            if (!citizenship && !resident) {
                System.out.println("You must be a resident");
            }

            if (!hasHighSchoolDiploma) {
                System.out.println("You must have a High School Diploma");
            }

            if(!(age >= 18 && age <= 35)){
                System.out.println("You are not in the age group");
            }

        }
    }
    }