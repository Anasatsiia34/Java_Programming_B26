package day28_array;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4];
        System.out.println(Arrays.toString(arr));

        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));

        arr[2] = 200;
        System.out.println(Arrays.toString(arr));

        arr = new double[5];
        System.out.println(Arrays.toString(arr));


    }
}
