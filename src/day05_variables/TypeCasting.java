package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b;

        int i2 = 100; // the byte type is automatically converted to int, because byte is smaller than int
        byte b2 = (byte) i2; // int is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte)

        int i3 = 500;
        long l1 = i3; // int is smaller than long, so it will automatically cast.

        long l2 = 200;
        int i4 = (int)l2; // If I try to go from long to int, I have to cast because long is a larger number than int/
    }
}
