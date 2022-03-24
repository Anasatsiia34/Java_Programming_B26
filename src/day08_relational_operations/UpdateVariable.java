package day08_relational_operations;

public class UpdateVariable {
    public static void main(String[] args) {

        //adding 1 to a variable

        int a = 10;
        a++;
        ++a;
       a = a +1;
       a = 11;

        // add 10 to the variables

        int b = 4;
        // 10 times I write b++;

        b = 14;
        b = b + 10; // read the value of b, adds 10 to it, then hte result is stored back into b by reassigning.

        b += 10; // this is the same as --> b = b +10

        int count = 0;
        count += 5;
        System.out.println(count);
        count -= 10; // count = count - 10
        System.out.println(count);
        count *= 2;
        System.out.println(count);






    }
}
