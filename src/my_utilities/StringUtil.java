package my_utilities;

public class StringUtil {
    public static String reverse(String str){
        String reversed = " ";
        for(int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
//////////////////////////////////////////////////////////////////


    public static String fixed(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

    }


    /////////////////////////////////////////////////////////////
    public static int frequency (String str, char letter){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;

            }

        }
        return count;
    }

    ///////////////////////////////////////////////////////////////////

}


