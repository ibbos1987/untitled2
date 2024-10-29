package excersice8;

import java.util.Scanner;

public class Excersice {
    public static void main(String[] args) {

        //en klass
        Spellchecker spell = new Spellchecker();
        Scanner scan=new Scanner(System.in);
        char input=scan.nextLine().charAt(0);

        System.out.println("Skriv in ett tecken");

        //om h är en bokstav då skrivs progamet ut H is a letter
        //kontrollen görs via metoden isLetter som kontrollerar om det är true eller false, om false så händer inget
        if (spell.isLetter(input)) {
            System.out.println(input+" is a letter between a-z");
        } else {
            System.out.println(input+" is not a letter between a-z");
        }

//        if (spell.isLetter('a')) {
//            System.out.println("A is a letter");
//        }
//
//        if (spell.isLetter('b')) {
//            System.out.println("B is a letter");
//        }
//
//        if (spell.isLetter('#')) {
//            System.out.println("B is a letter");
//        }
//
//        if (spell.isLetter('1')) {
//            System.out.println("B is a letter");
//        }
//
//        if (spell.isLetter('å')) {
//            System.out.println("B is a letter");
//        }

    }
}
