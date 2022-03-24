package day24_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = " java is a java language.java";
        int count = 0;

        while (str.contains("java")) {
            System.out.println(str);
            str = str.replaceFirst("java", "*");
            System.out.println(str);
        }

        int a = 10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);

        short s = 13 + 3 * (10 - 6) % 2;
        boolean n = s != 25;
        System.out.println(n);

        byte b = 104;
        boolean check = b < 100;
        if (check) {
            b -= 100;
        } else {
            b = 50;
            System.out.println(b);
        }

        double decimal = 13.142;

        int whole = decimal < 20 ? 20 : 10;
        System.out.println(whole);

        //boolean bool = 4 > 0;
        //String res = bool ? 10 : 5;
        // System.out.println(res);

    /*    int check1 = 132;
        String str1 = "";

        if (check1 % 2 == 0) {
            str1 += check;
            if (check1 % 5 == 0) {
                str1 += "132";
            } else {
                str1 = "500";
            }
        } else {
            str1 += "123";
        }
        System.out.println(str1);
*/

        int num = 2;
        boolean z = true;

        switch (num){

            case 0:
                z = false;
            case 1:
                System.out.println(1);
            case 2:
                if(z){
                    System.out.println(2);
                }else{
                    z = false;
                }
            case 3:
                if(z){
                    System.out.println(3);
                    z = false;
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!z){
                    break;
                }
                System.out.println(5);
        }


        byte b1 = 100;
        byte b2 = 15;

        int max = (b1 > b2) ? b1 + 2 : b2 -4;
        System.out.println(max);

       // int _firstName

    }
}
