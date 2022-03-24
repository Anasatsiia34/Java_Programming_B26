package day32_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String [4][];
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;

        String [] groupTwo = { "Basri", "Jelena", " Demet", " Shira"};
        cydeo[1] = groupTwo;

        cydeo[2] = new String[]{"Mustafa", "Lima"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo[3] = cydeo[2];

        for(String [] innerArray : cydeo){

            for(String eachWord : innerArray){
                System.out.println(eachWord);

            }

        }





    }
}
