package day27_nested_loops;

import java.util.Scanner;

public class FinraInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your stopping point");
        int stop = input.nextInt();

        for(int i = 1; i <= stop; i++){

            String str = "";

            if(i % 3 ==0){
                str += "fin";
            }

            if(i % 5 ==0){
                str += "ra";
            }
            System.out.println(str.isEmpty() ? i : str);

        }



    }
}
