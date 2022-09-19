package Task3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {
    StringParser stringParser = new StringParser();

    @Test
    void parse() {
        String s = "<><><>abc, cba<>";
        String[] exp = {"abc", " cba"};
        assertEquals(exp[1], stringParser.parse(s)[1]);
        assertEquals(exp[0], stringParser.parse(s)[0]);
    }
}