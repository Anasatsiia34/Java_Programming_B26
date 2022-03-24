package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "java is a language";
       s = s.replace('a', 'e');
        System.out.println(s);
String day = "Today is Monday";
day = day.replace("Monday", "Tuesday");
        System.out.println(day);

        String str = "Today in monday. we will monday. its monday";
        System.out.println(str.replaceFirst("monday", "tuesday"));

        String target = "Today is monday. we will monday. its monday";

        int first = target.indexOf('.');
        int second = target.lastIndexOf('.');
        String middle = target.substring(first , second);
        middle = middle.replace("monday", "tuesday");
        System.out.println(target.substring(0, first) + middle + target.substring(second));

    }
}
