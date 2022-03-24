package day09_scanner;
import java.util.Scanner;
public class WorkStatus {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");

        String name = input.next();

        System.out.println("Enter your last name ");
        String lastName = input.next();

        System.out.println(" Are you employed ");
        boolean employed = input.nextBoolean();

        System.out.println( " Are you a student ");
        boolean student = input.nextBoolean();


    }
}
