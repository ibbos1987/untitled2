package excersice12;

import java.util.Scanner;

public class ArrayWriter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names=new String[5];

        for (int i = 0; i < names.length; i++) {
            names[i]= scanner.nextLine();
        }

        System.out.println(names[0]+" "+names[4]);

    }
}
