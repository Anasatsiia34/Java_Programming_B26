package day28_array;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] nums = {500, 120, -80, 250, -10};
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){

            int number = nums[i];
            if(number > max){
                max = number;
            }else if (number < min){
                min = number;
            }

        }
        System.out.println("Min is: " + min + " Max is: " + max);





    }
}
