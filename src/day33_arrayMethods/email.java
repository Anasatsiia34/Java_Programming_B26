package day33_arrayMethods;

public class email {

    public static void builtEmail(String name, String domain){

        String email = name.substring(0,1);
        int space = name.indexOf(" ");
        email += name.substring(space + 1, space + 4);
        email+= "@" + domain + ".com";
        System.out.println(email);

    }

    public static void main(String[] args) {
        builtEmail("James Bond", "Gmail");
        builtEmail("Anna Smith", "Yahoo");
    }
}
