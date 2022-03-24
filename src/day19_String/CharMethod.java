package day19_String;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));


        int secondToLastIndex = s.length() -2;
        char secondToLastChar = s.charAt(secondToLastIndex);
        System.out.println("second to last character: " + secondToLastChar);



    }
}
