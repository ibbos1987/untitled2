package excercise3;

public class Excercise {
    public static void main(String[] args) {
        int tal1 = 1;
        int tal2 = 1;
        /*while (tal1<=100){
            System.out.println(tal1++);
        }*/
       /* while (tal1 <= 100) {

            if (tal1 % 2 == 0) {
                System.out.println(tal1);
            }
            tal1++;
        }*/
        System.out.println();
        System.out.println("Fibonacci tal ");
        System.out.print(tal2 + " ");
        while (tal2 <= 100) {
            int tal3 = tal1 + tal2;

            System.out.print(tal2 + " ");


            tal1 = tal2;
            tal2 = tal3;

        }
        System.out.println();
    }
}
