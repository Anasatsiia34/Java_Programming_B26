package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for ( int number = 1; number <= 10; number++){

            for(int multnumber = 1; multnumber <= 10; multnumber++)
                System.out.println("" + number + "*" + multnumber + "=" + (number * multnumber));
        }


    }
}
