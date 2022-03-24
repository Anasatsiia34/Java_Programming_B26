package day15_switch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gradeLevel = input.nextInt();
        String location = "" , teacher = "";
        int numberOfGroups = 0;
        if(gradeLevel>=1 && gradeLevel <=6){
            if(gradeLevel ==1 ){
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            }else if (gradeLevel == 2){

            }else if (gradeLevel ==3 ){

            }else if (gradeLevel ==4){

            }else if (gradeLevel ==5){

            }else{

            }

            System.out.println("location" + location);
            System.out.println("Number of groups" + numberOfGroups);
            System.out.println("Teacher in charge" + teacher);



        }else{
            System.out.println("Grade must be between 1-6");
        }
    }
}
