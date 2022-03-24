package day09_scanner;

public class speeding {
    public static void main(String[] args) {

        int currentSpeed = 50;
        int speedLimit = 55;

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding; " + isSpeeding);

    }
}
