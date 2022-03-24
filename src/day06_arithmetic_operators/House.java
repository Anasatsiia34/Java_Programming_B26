package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {

        String houseType = "Penthouse";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isOnSale = false;
        double costOfHouse = 1_000_000.99;
        String address = "1294 Central Park";
        int zipcode = 28402;
        boolean hasPark = true;
        double schoolRating = 4.6;

        String houseInfo = "The " + houseType + " on " + address + ", " + zipcode + ". Costs $" + costOfHouse + "\nThe " + houseType + "has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchen\nIt also includes a basement: " + hasBasement + ", has an attic: " + hasAttic + ", has a pool: " + hasPool + "\n and is on sale: " + isOnSale + ". The schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);



    }
}
