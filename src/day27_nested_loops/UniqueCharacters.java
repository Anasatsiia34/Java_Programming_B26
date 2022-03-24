package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        int count = 0;
        for(int i = 0; i < str.length();i++) {
            char letter = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);

                if (letter == inner) {

                    count++;
                }
            }

            if(count == 1){
                System.out.println(letter);
            }
        }



    }
}
