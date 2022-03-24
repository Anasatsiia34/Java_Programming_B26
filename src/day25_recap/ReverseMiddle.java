package day25_recap;

public class ReverseMiddle {
    public static void main(String[] args) {
        String str = "I love java";
        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middleWord = str.substring(firstSpace +1 , lastSpace +1);
        String reversed = "";
        for(int i = middleWord.length() -1; i >= 0; i--){
            reversed += middleWord.charAt(i) ;
        }

        System.out.println(str.substring(0, firstSpace) + reversed + str.substring(lastSpace));

        }


    }

