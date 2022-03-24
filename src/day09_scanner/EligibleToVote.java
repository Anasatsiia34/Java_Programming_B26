package day09_scanner;

import java.lang.reflect.AnnotatedArrayType;
import java.rmi.MarshalException;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Ana";
        boolean AreCitizen = true;
        boolean DoHaveCriminalBackground = false;
        int age = 25;

        boolean isEligibleToVote = age >= 18 && AreCitizen == true && DoHaveCriminalBackground == false;

        System.out.println(name + " is eligible to vote " + isEligibleToVote);


    }
}
