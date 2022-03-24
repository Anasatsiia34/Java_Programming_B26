package day08_relational_operations;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 18;

        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;

        System.out.println( "You are a kid: " + isKid);
        System.out.println( "You are a senior citizen: " + isSenior);
    }
}
