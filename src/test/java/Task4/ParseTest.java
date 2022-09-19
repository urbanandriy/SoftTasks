package Task4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParseTest {
    Parse parse = new Parse();
    @Test
    void parseString() {
        String input = "<A><A>";
        String[] expected = {"A","A"};
        String input1 = "<A><A><B>";
        String[] expected1 = {"A","A","B"};
        System.out.println(Arrays.toString(parse.parseString(input)));
        assertEquals(Arrays.toString(expected),Arrays.toString(parse.parseString(input)));
        assertEquals(Arrays.toString(expected1),Arrays.toString(parse.parseString(input1)));

    }
}