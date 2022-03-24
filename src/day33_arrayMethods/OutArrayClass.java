package day33_arrayMethods;

import java.util.Arrays;

public class OutArrayClass {

    public static void firstElement (int [] nums){
        System.out.println("First element: " + nums[0]);
    }

    public static void lastElement(int [] nums){
        System.out.println("Last Element: " + nums[nums.length - 1]);
    }
    public static void middleElement(int [] nums){

        if(nums.length % 2 == 0){
            System.out.println("First middle: " + nums[nums.length /2 - 1]);
            System.out.println("Second Middle: " + nums[nums.length /2]);

        }else{
            System.out.println("Middle: " + nums[nums.length / 2]);
        }
    }

    public static void main(String[] args) {

       int [] numbers = { 50, 0, 10, 500, 20, 40, 124};

       firstElement(numbers);
       lastElement((numbers));
       middleElement(numbers);


char [] array = {'D', 'C', 'B', 'A'};
Arrays.sort(array);

for(char each : array) {
    System.out.println((each + " "));
    if(each == 'D') {
        continue;
    }
}
    }
}
