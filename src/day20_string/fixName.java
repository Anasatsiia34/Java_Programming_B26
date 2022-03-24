package day20_string;

import java.util.Scanner;

public class fixName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String name = input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();

        name = name.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        //name = name.substring(0,1).toUpperCase();
       // lastName = lastName.substring(0,1).toUpperCase();

        String fixedName = name.substring(0,1).toUpperCase();
        fixedName += name.substring(1);

        String fixedLast = lastName.substring(0,1).toUpperCase();
        fixedLast += lastName.substring(1);
        System.out.println(fixedName +" " + fixedLast);


    }


}
