package day33_arrayMethods;

public class LastCHaracters {
    public static void main(String[] args) {

        String [][] words = { {"James", "is", "back"},{ "he", "was", "never", "gone"},{"metods", "tommorow"}};

        for(String [] eachArray : words)

        for(String eachWord : eachArray){
            System.out.println(eachWord.charAt(eachWord.length()-1));
        }
        System.out.println();

    }
}
