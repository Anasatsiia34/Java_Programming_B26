package day29_array;

public class Store {
    public static void main(String[] args) {

        String [] items = {"Shoes", " Jackets", " Gloves", "Airpods", "Ipod", "Backpack"};

        double [] prices = {89.99, 150.0, 999.99, 250.0, 439.5, 39.99};
        int [] itemIds = { 12345, 12346, 12347, 12348, 1239, 12350};

       // for(int i = 0; i < items.length; i++){

           // System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and the cost is: " + prices[i]);

            int indexOfGloves = -1;

            for(int i = 0; i < items.length; i++ ){
                if(items[i].equalsIgnoreCase("gloves")){
                    indexOfGloves = i;
                    break;
                }
            }

double mostExpensive = prices[0];
            int indexOfMostExpensive = 0;
            for( int i = 0; i < prices.length; i++){

                if(prices[i] > mostExpensive){
                    mostExpensive = prices[i];
                    indexOfMostExpensive = i;
                }
            }
        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfMostExpensive]);


        }


    }

