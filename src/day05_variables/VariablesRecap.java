package day05_variables;

public class VariablesRecap {
    public static void main(String[] args) {

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        // We cannot print the variable because they don't have a value
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);

        //Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentsInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        //declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature " + temperature);
        System.out.println("It is day " + javaDays + " in Java class");
    }
}
