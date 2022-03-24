package day21_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abccde";

        if(s.length()%2 == 0){
            String middle1 = s.substring(s.length()/2-1, s.length()/2+1);
            System.out.println(middle1);

        }else{
            char middle = s.charAt(s.length()/2);
            System.out.println(middle);
            System.out.println("With substring: " + s.substring(s.length()/2, s.length()/2+1));
        }




    }
}
