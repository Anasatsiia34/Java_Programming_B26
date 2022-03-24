package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {


        String s = "aaabbbcccccddddee";
        String sub = "";
        String biggest = "";
        for (int i = 0; i < s.length(); i++) {

            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i + 1)) {

                if (sub.length() > biggest.length()) {
                }
                sub = "";
            }

        }
    }
}