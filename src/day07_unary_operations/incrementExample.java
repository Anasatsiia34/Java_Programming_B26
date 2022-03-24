package day07_unary_operations;

public class incrementExample {
    public static void main(String[] args) {

        int x =0;
        System.out.println(x); //0
        System.out.println(x + 1);//1
        System.out.println(x); // 0, because we didn't reassing, just added one manually

        x = x + 1; // take the value of x, which is 0 then I add 1 -> 1

        x++;
        System.out.println(x); //2

        ++x;//pre increment
        System.out.println(x); //3

        System.out.println(++x); // because it is preincrement it will add 1 right away, so 4 is printed
        System.out.println(x++); // the stsatment is run first because it is a post increment, we will see 4
        System.out.println(x); //



    }
}
