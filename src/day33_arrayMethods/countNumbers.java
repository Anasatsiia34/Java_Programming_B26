package day33_arrayMethods;

public class countNumbers {

    public static void count(int n){
        for(int i = 0; i <= n; i++){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        count(5);
        count(10);
    }



}
