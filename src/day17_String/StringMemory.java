package day17_String;

public class StringMemory {
    public static void main(String[] args) {

String first = "java"; // String literal, in String pool

        String second = new String("java"); // String object, not in String pool, but directly in the heap

        System.out.println(first == second);

        // == with String types gives you false. The == doesn't compare the characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first == third);

        String fourth = "Java";// at this line, hoe much object in the String pool: 2
        // you have "java" "Java"

        String fifth = new String("java");


    }
}
