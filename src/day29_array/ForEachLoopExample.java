package day29_array;

public class ForEachLoopExample {
    public static void main(String[] args) {

int [] nums = {30, 12, 159, 12};

for(int i =0; i < nums.length; i++){
    System.out.println("traditional " + nums[i]);
}

        System.out.println();
for(int element : nums){
    System.out.println("far each: " + element);
}

//String
String [] classes = {"java", "soft skills", "selenium", "api"};

for(int i = 0; i < classes.length; i++){
    System.out.println(classes[i]);
}




    }
}
