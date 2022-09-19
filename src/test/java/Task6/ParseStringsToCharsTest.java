package Task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseStringsToCharsTest {
ParseStringsToChars parseStringsToChars = new ParseStringsToChars();
    @Test
    void parse() {
        String[] input = {"123123","345345"};
        char[][] expected = {{'1','2','3','1','2','3'},{'3','4','5','3','4','5'}};
        assertArrayEquals(expected,parseStringsToChars.parse(input));
    }
}