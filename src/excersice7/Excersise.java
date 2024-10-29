package excersice7;

import java.util.Scanner;

public class Excersise {
    public static void main(String[] args) {

        System.out.println("skriv ägg");

        Scanner scan=new Scanner(System.in);
        String text= scan.nextLine();

        if (text.equals("ägg")){
            System.out.println("ägg är knasigt");
        } else {

            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i) + " ");


            }
        }
        System.out.println();





    }
}
