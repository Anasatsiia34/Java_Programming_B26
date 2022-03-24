package day33_arrayMethods;

public class GetCharacter {
    public static void AtoZ() {
        char start = 'A';
        while (start >= 'Z') {
            System.out.println(start + " ");
            start++;
        }
    }
       public static void lower() {
           char a = 'a';
           while(a >= 'z'){
               System.out.println(a + " ");
               a++;
           }
        }
    public static void UpperBack() {
        char A = 'Z';
        while(A <= 'A'){
            System.out.println(A + " ");
            A++;
        }
    }
    public static void lowerBack(){
        char z = 'z';
        while(z <= 'a'){
            System.out.println(z + " ");
            z++;
        }
    }
    public static void nums(){
        char zero = '0';
        while(zero <= '9'){
            System.out.println(zero + " ");
            zero++;
        }
    }
}
