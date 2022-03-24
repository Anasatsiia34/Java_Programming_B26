package day28_array;

public class Store {
    public static void main(String[] args) {

       String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "Ipad"};

       boolean yesOrNo = false;

       for(int i = 0; i < items.length; i++){
           String thing = items[i];

           if(items[i].equalsIgnoreCase("jackets")){
               yesOrNo = true;
               break;
           }else{
               yesOrNo = false;
           }

       }
        System.out.println(yesOrNo);

    }
}
