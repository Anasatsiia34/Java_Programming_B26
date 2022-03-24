package day10_scanner;
import java.util.Scanner;
public class yourInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" PLease, enter your favorite book ");
        String book = input.nextLine();


        System.out.println(" PLease, enter your age ");
        byte age = input.nextByte();

        System.out.println(" PLease, enter your favorite number ");
        long number = input.nextLong();




    }
}
