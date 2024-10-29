package uppgifter;

public class uppgift34 {

    public static void main(String[] args) {

        String text = "Vi är bäst* eller?";

        for (int i = 0; i < text.length(); i++) {
            char tecken = text.charAt(i);
            System.out.print(tecken);


            if (tecken == '*') {
                break;
            }


        }
        System.out.println();
        System.out.println(text.length());


    }


}
