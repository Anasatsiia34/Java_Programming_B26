package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {
        System.out.println("My name starts with 'A'");


        System.out.println("This was not tabbed");
        System.out.println("\tThis was tabbed once");
        System.out.println("\t\tThis was tabbed twice");

        //example of nest line
        System.out.println();
        System.out.println("1) First");
        System.out.println("2) Second");
        System.out.println("3) Third");

        System.out.println("\n 1) First' \n 2) Second \n 3) Third");
    }
}
