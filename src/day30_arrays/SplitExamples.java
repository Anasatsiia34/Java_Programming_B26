package day30_arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,thursday,saturday,sunday";
        String [] days = s.split(",");
        //System.out.println(Arrays.toString(days));

        for(String day : days){
            System.out.println(day);
        }
        System.out.println();


                String [] withOutDay = s.split("day");
        System.out.println(withOutDay);


       /* int i =0;
        do {
            i++;
            System.out.println(i + " ");
        }while ( i <=4);
        */
        int z =5;
        for(int i = 5; i > 0; i--){
            z+=i;
        }
        }
    }

