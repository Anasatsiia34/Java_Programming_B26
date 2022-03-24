package day03_comments_escape_sequence;

public class Quote {

    public static void main(String [] args){

        System.out.println("I like \"java\" programming");

        /* The first quote isv before java printing the text
        The second quote is to print the " quotation mark in the console
         */

        System.out.println("abc\\def");

        /* The first backslash is for the syntax of escape characters
        The second backslash is for the backslash characters to be output
         */

        System.out.println("abc\\\\def");

        System.out.println("abc\\\"def");
    }
}
