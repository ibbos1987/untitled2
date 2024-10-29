package excercise2;

import java.util.Arrays;

public class Excercise {
    public static void main(String[] args) {
        int number1=25;
        int number2=5;

        System.out.println();
        if (number1>number2){
            System.out.println("Första talet är störst");
        } if (number1<number2) {
            System.out.println("Andra talet är störst");
        }
        System.out.println();

       if (number1 % number2==0){
            System.out.println("Jämt delbart ");
        } else {
            System.out.println("inte jämt delbart ");
        }


    }
}
