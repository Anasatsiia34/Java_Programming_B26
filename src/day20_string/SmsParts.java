package day20_string;

public class SmsParts {
    public static void main(String[] args) {

        String sms = " Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int senderStart = sms.indexOf('<');
        int senderEnd = sms.indexOf('>');
        int numberStart = ('[');
        int numberEnd = (']');
        int messageStart = sms.indexOf('{');
        int messageEnd = sms.indexOf('}');

        String sender = sms.substring(senderStart +1 , senderEnd);
        String number = sms.substring(numberStart +1, numberEnd);
        String message = sms.substring(messageStart +1, messageEnd);
        System.out.println("Sender is: " + sender + " ,number is: " + number + " ,message is: " + message);

    }
}
