package day16_review;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class retake {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        {

            System.out.println("What was the grade?");
            int grade = input.nextInt();
            System.out.println("Which attempt number is it?");
            int attempt = input.nextInt();

            if (attempt == 1) {
                grade = grade - (int) (grade * 0.1);

            } else if (attempt == 2) {
                grade = grade - (int)(grade * 0.2);

            } else if (attempt == 3) {
                grade = grade - (int)( grade * 0.35);

            }else{
                System.out.println("Invalid attempt");
            }

            System.out.println(grade);
        }

    }
}
