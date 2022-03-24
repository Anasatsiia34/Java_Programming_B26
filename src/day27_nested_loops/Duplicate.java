package day27_nested_loops;

public class Duplicate {
    public static void main(String[] args) {


        String str = "AAABCCDEEF";
String checked = "";
;        for(int i =0; i < str.length();i++){
if(checked.contains("" + str.charAt(i))){
    continue;
}
            int count = 0;

           for(int j = 0; j < str.length(); j++){

               if(str.charAt(i) == str.charAt(j)){
                   count++;
               }
               checked += str.charAt(i);

           }
           if(count > 1 ){
               System.out.println(str.charAt(i));
           }
        }
    }
}
