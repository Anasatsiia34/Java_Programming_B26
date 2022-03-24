package day34_methods;

public class CreditScore {
    public static void main(String[] args) {

        gerCreditScore();

        int score = gerCreditScore();
        System.out.println(score);

        System.out.println(gerCreditScore());
        System.out.println(gerCreditScore() + 50);

        System.out.println(isGood(680));
        System.out.println(isGood(720));

    }

    public static int gerCreditScore(){
        return 800;
    }

    public static boolean isGood (int creditScore){
        if(creditScore >= 700){
            return true;
        }else{
            return false;
        }
    }

}
