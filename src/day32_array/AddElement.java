package day32_array;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int [] arr = {45, 123, 62};

        int [] arr2 = Arrays.copyOf(arr, 4);
        arr2[3] = 100;
        System.out.println(Arrays.toString(arr2));


    }
}
