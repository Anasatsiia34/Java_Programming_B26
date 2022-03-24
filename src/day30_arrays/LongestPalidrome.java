package day30_arrays;

public class LongestPalidrome {
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for (String eachWord : words) {

            boolean isPalindrome = true;
            for (int i = 0; i < eachWord.length(); i++) {

                if (eachWord.charAt(0) != eachWord.charAt(eachWord.length() - 1)) {

                    isPalindrome = false;
                    break;

                }

            }
            if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                longestPalindrome = eachWord;
            }

        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
    }
}