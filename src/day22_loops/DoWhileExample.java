package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 0;

        do{

            System.out.println(a);
            a++;

        }while (a<=10);


        int a2 = 0;

        System.out.println("With false boolean: ");

        do{

            System.out.println(a2);
            a++;

        }while (a2 == 10);

        System.out.println("as while loop");

        int a3 =0;

        while(a2 ==10){
            System.out.println(a3);
            a3++;
        }


    }
}
