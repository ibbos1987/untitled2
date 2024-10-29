package tdd;

import java.util.Arrays;
import java.util.Scanner;

public class UserMain {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String line;
           //int antalRader = 0;
            TextAnalayzer textAnalayzer=new TextAnalayzer();
            do {
                //antalRader++;
                System.out.print("Skriv in användarnamn och lösenord ");

                line = scanner.nextLine();
                if (! line.contains("stop")) {
                    textAnalayzer.lineInput(line);
                    String[] array = line.split(" ");
//                    System.out.println(Arrays.toString(array));
//                    System.out.println("Ditt användarnamn är " + array[0]);
//                    System.out.println("Ditt lösenord är " + array[1]);

                    int sumAntalTecken = 0;
                    sumAntalTecken = line.length();
                    //System.out.println(sumAntalTecken);
                }
                // if (line.contains("stop")) System.out.println("Tack och hej");
            } while (!line.contains("stop"));
            System.out.println(textAnalayzer.getRows());
        }


}
