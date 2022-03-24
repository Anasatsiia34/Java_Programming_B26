package day33_arrayMethods;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sutInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }
    public static void gerReadyToGo(){
        System.out.println("Putting on seat belt");
        System.out.println("Check mirrors");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }
    public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Putting car into drive");
        System.out.println("Going forwards");
    }
    public static void goInHurry(){
        unlockCar();
        sutInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {

        unlockCar();
        openDoor();
        sutInCar();
        gerReadyToGo();
        startCar();
        driveAndGo();
    }

}
