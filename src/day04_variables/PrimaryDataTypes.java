package day04_variables;

public class PrimaryDataTypes {
    public static void main(String[] args) {

        byte age = 18;
        System.out.println("age");
        System.out.println(age);

        //byte age2 = 200; 200 is too big for byte type

        short year; // declared a variable called year. It is short type
        year = 2022; // assigned 2022 into my year variable
        year = 2023; // reassigns the value to be 2023, it changes it.

        int addressNumber = 2444400;

        //long bigNumber = 194483486593L;  the value is int type, it is too big for int

        long bigNumber;
        bigNumber = 19384800394880L; // addidng L to the number, tells the compiler it is a long number
    }
}
