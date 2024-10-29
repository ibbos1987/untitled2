package excersice5;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String text=scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        //System.out.println("din siffra är: "+number);
        //System.out.println("du skrev "+text);


        HelloWorldPrinter hwp = new HelloWorldPrinter();

        // hwp.print();

        hwp.printManyTimes(number);


    }

}
