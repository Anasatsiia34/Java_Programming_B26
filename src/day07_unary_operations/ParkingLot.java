package day07_unary_operations;

public class ParkingLot {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("Two cars drive into a parking lot");
        // approach 1

        cars= cars + 2;
        System.out.println(cars);

        System.out.println(" Two more cars drive in");

        //approach 2:
        cars++;
        cars++;
        System.out.println(cars);
    }
}
