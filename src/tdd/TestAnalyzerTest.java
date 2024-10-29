package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAnalyzerTest {

    @Test
    void numberOfRows(){
        TextAnalayzer textAnalayzer=new TextAnalayzer();
        textAnalayzer.lineInput("hej på er i klassen");
        textAnalayzer.lineInput("hej på dig Tomas");
        textAnalayzer.lineInput("hej på alla andra också");
        assertEquals(3, textAnalayzer.getRows());
    }
}
