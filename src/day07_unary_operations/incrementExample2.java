package day07_unary_operations;

public class incrementExample2 {
    public static void main(String[] args) {

        int age = 20;
        System.out.println(age); //20
        System.out.println(age++); //20, but increment will show on the next line since it's a post increment and it runs after the code

        int i = 5; // 6
        int z = i++; // 5, but add one on the next line.

        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1;

        System.out.println(a);
        System.out.println(b);

        int c = a++; // a is 10 -> 10 + 1 = 11

        System.out.println(c);
    }
}
