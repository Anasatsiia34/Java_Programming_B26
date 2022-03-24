package day23_loops;

public class CountLetter {
    public static void main(String[] args) {

        String n = "aabbcaa";

        int count = 0;

        for(int i = 0; i < n.length(); i++){

            if(n.charAt(i) == 'a'){
                count++;
            }

        }

        System.out.println(count);




    }
}
