package day23_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaahihhihibbbcch";
        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }

        }


    }
}
