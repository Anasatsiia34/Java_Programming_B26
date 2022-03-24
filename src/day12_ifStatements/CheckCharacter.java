package day12_ifStatements;

public class CheckCharacter {
    public static void main(String[] args) {

       char letter = 'A';

       if ( letter >= 'a' && letter <= 'z'){
           System.out.println("lowercase");
       }else{
           System.out.println("uppercase");
       }

    }
}
