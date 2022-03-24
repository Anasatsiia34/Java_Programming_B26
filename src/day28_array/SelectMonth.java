package day28_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month number");
        int num = input.nextInt();

        String [] arr = {"default", "january", "February", "March", "April", "May", "June"," July", " August", " September", "October", "November", "December"};

        System.out.println(arr[num]);


    }
}
