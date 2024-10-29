package tdd;

public class TextAnalayzer {

    private int rows;

    public TextAnalayzer() {
        rows = 0;
    }

    public void lineInput(String line) {
        rows++;
    }

    public int getRows() {
        return rows;
    }
}
