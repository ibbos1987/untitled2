package excersice12;

public class Array1 {
    public static void main(String[] args) {

        //Array med flera namn
//        String[] names = {"Blue", "Lasse", "Lisa", "Erik", "Vina"};

        String[] names = new String[5];
        names[0] = "Blue";
        names[1] = "Lasse";
        names[2] = "Lisa";
        names[3] = "Erik";
        names[4] = "Vina";


//        System.out.println(names[0] + "\n" + names[4]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        String myString="hej på dig";

        String[] stringArray=myString.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println(stringArray.length+" ord är det"); //till inlämnings provet, skriv ut antal ord i myString
        //genom att gå igenom stringArray
    }
}
