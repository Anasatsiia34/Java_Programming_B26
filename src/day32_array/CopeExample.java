package day32_array;

import java.util.Arrays;

public class CopeExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] z = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(z));

        z[0] = 500;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("z: " + Arrays.toString(z));



    }
}
