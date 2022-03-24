package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean teacher = false;
        boolean policeOfficer = true;
        boolean firefighter = false;

        boolean discount = isWeekend || policeOfficer || teacher || firefighter;

        System.out.println(discount);





    }


}
