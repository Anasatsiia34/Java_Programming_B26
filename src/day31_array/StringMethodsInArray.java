package day31_array;

public class StringMethodsInArray {
    public static void main(String[] args) {

      String app = "etsy";

      String zones = "us-east1, us-west1, us-west2, us-west";

      String [] eachZone = zones.split(",");

      for(String zone : eachZone){
          System.out.println(app + " is deploying on " + eachZone);
      }
    /*
      for(int i =0; i < eachZone.length; i++){
            System.out.println(app + " is deploying on " + eachZone[i]);
        }other way with a loop
        */



    }
}
