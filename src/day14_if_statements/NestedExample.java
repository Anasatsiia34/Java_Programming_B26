package day14_if_statements;

public class NestedExample {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

                if(a) {
                    System.out.println(1);
                    if(b){

                        if(c){
                            System.out.println(3);
                        }
                        System.out.println(2);
                    }

                }else{
                    System.out.println("z");
                }
    }
}
