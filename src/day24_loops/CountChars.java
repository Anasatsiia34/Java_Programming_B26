package day24_loops;

public class CountChars {
    public static void main(String[] args) {

        String s = "2juMp41EEkd4s4";

        int upper = 0;
        int lower = 0;
        int number = 0;
        for(int i = 0; i <= s.length(); i++){


           char letter =  s.charAt(i);

           if(letter >= 'A' && letter <= 'Z'){
               upper++;
           }else if( letter >= 'a' && letter <= 'z'){
               lower++;
           }else if( letter >= '0' && letter <= '9'){
               number++;
           }

        }

        System.out.println("Upper: " + upper + " Lower: " + lower + " Numbers: " + number );


    }
}
