package day06_arithmetic_operators;

public class CalculatingSalary {
    public static void main(String[] args) {

        int salary = 100_000;
        double statesTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = 8000;
        double federalTax = 21000;
        double totalTax = 29000;
        double salaryAfterTax = 71_000;

        System.out.println("salaryAfterTax = " + salaryAfterTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("statesTaxRate = " + statesTaxRate);
        System.out.println("salary = " + salary);


    }
}
