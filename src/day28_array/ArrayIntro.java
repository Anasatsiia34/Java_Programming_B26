package day28_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

     String cityOne = "Chicago";
     String cityTwo = "New York";
     String cityThree = " Houston";
     String cityFour = " Denver";
     String cityFive = "Pittsburgh";

        // declare array with values

        String []cities = { "Chicago", "New York", "Houston", "Denver", "Pittsburgh"};

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);


        System.out.println(Arrays.toString(cities));

    }

}
