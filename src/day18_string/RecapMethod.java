package day18_string;

public class RecapMethod {

    public static void main(String[] args) {

        String s = "pen";

        String s2 = new String ("pen");

        System.out.println("Compare with == " + (s == s2));
        System.out.println("Compare with .equals() " + (s.equals(s2)));

        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){

        }

        int len = s.length();
        System.out.println(len);

    }
}
