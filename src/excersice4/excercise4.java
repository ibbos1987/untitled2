package excersice4;

public class excercise4 {
    public static void main(String[] args) {

        System.out.println("Numbers 1-100: ");


        for (int i = 0; i < 100; i++) {
            System.out.print((i + 1) + " ");

        }
        System.out.println();
        System.out.println();
        //exempel2
        System.out.println("jämna tall upp till 100");

        for (int i = 0; i < 100; i += 2) {

            System.out.print((i + 2) + " ");

        }
        System.out.println();
        System.out.println();
        System.out.println("Fibonacci tal");

        //Fibonacci tal
        int first = 1;
        System.out.print(first + " ");
        int second = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }

    }
}
