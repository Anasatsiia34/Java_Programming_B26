package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {
/*
        String s = "today is monday";
        String [] words = s.split(" ");
        String firstWord = s.substring(0, s.charAt(' '));
        String secondWord = s.substring(s.charAt(' '), s.charAt(' ')+1);
        String thirdWord = s.substring(s.charAt(' ') + 1);
        System.out.println(thirdWord + secondWord + firstWord);

*/

        String str = "Today is monday";
        String [] words = str.split(" ");
        String reversed ="";

        for( int i = words.length -1;i >= 0; i--){
            reversed += words[i] + " ";

        }
        System.out.println(reversed.trim());

    }
}
