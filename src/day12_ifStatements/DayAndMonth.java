package day12_ifStatements;

public class DayAndMonth {
    public static void main(String[] args) {

        int MonthNumber = 2;
        boolean has31Day = MonthNumber ==1 || MonthNumber == 3 || MonthNumber == 5 || MonthNumber == 7 || MonthNumber == 8 || MonthNumber == 10 || MonthNumber == 12;
        boolean has30Days = MonthNumber == 4 || MonthNumber == 6 || MonthNumber == 9 || MonthNumber == 11;
        boolean has28Days = MonthNumber == 2;

       /* if(has31Day){
            System.out.println("31 days");
        }
        if(has30Days){
            System.out.println("30 days");
        }
        if(has28Days){
            System.out.println("28 days");
        }*/

        if(has31Day){
            System.out.println("31 day");
        } else if(has30Days) {
            System.out.println("30 days");
        } else if(has28Days) {
            System.out.println(" 28 days");
        }else{
            System.out.println("invalid number");
        }

    }
}
