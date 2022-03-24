package day31_array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str = "listen";
        String str1 = "silent";

        char [] arr1 = str.toCharArray();
        char [] arr2 = str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println(isAnagram ? "anagram" : "not anagram");



    }
}
