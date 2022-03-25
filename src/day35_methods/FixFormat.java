package day35_methods;

public class FixFormat {
    public static void main(String[] args) {

        System.out.println(fixed("anaSTAsiia"));

    }

    public static String fixed(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

    }
}
