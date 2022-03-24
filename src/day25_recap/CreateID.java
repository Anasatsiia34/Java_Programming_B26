package day25_recap;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name ");
        String name = input.next().toLowerCase();
        System.out.println("Enter your last name ");
        String lastName = input.next().toLowerCase();
        String id = name.substring(0,1);

        id+= lastName.substring(0,1).toUpperCase();
        id+= lastName.substring(1,3).toLowerCase();
        id+= name.length()*2;

        System.out.println(id);



    }
}
