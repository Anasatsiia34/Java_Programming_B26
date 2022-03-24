package day32_array;

import day05_variables.VariablesRecap;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {

        int [][] group = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}

        };
        for(int [] eachArray : group)
        {

            double sum =0;

            for(int eachNumber : eachArray)
            {
            sum += eachNumber;}
        }

       // System.out.println(Arrays.toString(eachArray) + //" the average is: " + (sum/eachArray.length));
    }
}
