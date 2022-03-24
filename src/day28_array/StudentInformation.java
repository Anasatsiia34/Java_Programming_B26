package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] studentOne  = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String[4];
        studentTwo[0] = "010";
        studentTwo[1] = "Jamie";
        studentTwo[2] = "Smith";
        studentTwo[3] = "7";
        System.out.println(Arrays.toString(studentTwo));

String [] studentThree = new String [4];
Scanner input = new Scanner (System.in);
        System.out.println("Enter your id");
        studentThree[0] = input.nextLine();
        System.out.println("Enter your name");
        studentThree[1] = input.nextLine();
        System.out.println("Enter your last name");
        studentThree[2] = input.nextLine();
        System.out.println("Enter your batch");
        studentThree[3] = input.nextLine();

        System.out.println(Arrays.toString(studentThree));

        String [] studentFour = new String[4];
        String [] questions = {"Enter your id", "Enter your last name", "Enter your last name", "Enter your batch number"};

        for(int i = 0; i < 4; i++) {
            System.out.println(questions[i]);
            studentFour[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(studentFour));


    }
}
