package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        String day= input.nextLine();
        String whichClass = "";
        String time = "";
        boolean officeHours;

        switch (day){
            case "monday":
            case "Monday":
            case "mon":
                whichClass= "Java";
                time = " 7-10";
                officeHours = false;
                System.out.println(" It is " + whichClass + " at " + time + " Office hours: " + officeHours);
                break;
            case "Tuesday":
            case"tuesday":
            case "tue":
                whichClass = "Java";
                time = "7-10";
                officeHours = true;
                System.out.println(" It is " + whichClass + " at " + time + " Office hours: " + officeHours);
                break;
            case "Wednesday":
            case " wednesday":
            case "wed":
                whichClass = " Java";
                time = " 7-10";
                officeHours = false;
                System.out.println(" It is " + whichClass + " at " + time + " Office hours: " + officeHours);
                break;
            case " Thursday":
            case " thursday":
            case "thu":
                whichClass = "Soft Skills";
                time = "7 -10";
                officeHours= true;
                System.out.println(" It is " + whichClass + " at " + time + " Office hours: " + officeHours);
                break;
            case " Friday":
            case "friday":
            case " fri":
                System.out.println("No class that day");
                break;
            case"Saturday":
            case " saturday":
            case"sat":
                whichClass = "Java";
                time = "10 - 5";
                officeHours = false;
                System.out.println(" It is " + whichClass + " at " + time + " Office hours: " + officeHours);
                break;
            case"Sunday":
            case"sunday":
            case "sun":
                whichClass = "Java";
                time = "10 -5 ";
                officeHours = false;
                System.out.println(" It is " + whichClass + " at " + time + " Office hours: " + officeHours);
                break;
            default:
                System.out.println("Invalid day");


        }



    }
}
