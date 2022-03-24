package day26_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String a = "apple";
int count = 0;
        for(int i =0; i < a.length(); i++){
            char letter = a.charAt(i);
            for(int j = 0; j < a.length(); j++){

                char each = a.charAt(j);

                if(letter == each){
                    count++;
                }
            }

        }


    }
}
