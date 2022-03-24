package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class friendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends you got?");
        int size = input.nextInt();
        String [] friends = new String[size];

        for (int i =0; i < friends.length; i++){

            System.out.println("Enter friends name");
            friends[i] = input.next();


        }
        System.out.println(Arrays.toString(friends));
    }
}
