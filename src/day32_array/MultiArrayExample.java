package day32_array;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10};
        int [] m = {5, 10, 100, 39, 19};

        int [][] all = { n, m};

        System.out.println(Arrays.deepToString(all));
        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("second array: " + Arrays.toString(all[1]));

        System.out.println();
        int [][] mulyi = {

                {90,80, 70},
                {19,51,1129,12},
                {10, 1900},
                {14}

        };


    }
}
