package excersice8;

public class Spellchecker {

    //en metod
    public boolean isLetter(char sign) {


        boolean isLetter = false;

        if ((sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z')) {
            isLetter = true;
        }

        return isLetter;
        //return Character.isLetter(sign);

    }
}
