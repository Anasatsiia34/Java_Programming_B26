package day07_unary_operations;

public class DifferentTypes {
    public static void main(String[] args) {
//Both int
        System.out.println(10 - 5);
        System.out.println(10 * 5);

        //double/int
        System.out.println(10.0 / 5);

        byte b1 = 10;
        byte b2 = 20;

        //byte sum = b1 + b2; this will not work because values are changed to int during calculation

        int sum = b1 + b2;

        byte sumByte = (byte)(b1 + b2);
    }
}
