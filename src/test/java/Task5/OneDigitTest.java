package Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneDigitTest {
OneDigit oneDigit = new OneDigit();
    @Test
    void transform() {
        char[] chars = {'1'};
        char[] chars1 = {'3'};
        char[] chars2= {'4'};
        char[] chars3 = {'7'};
        String expected = "один";
        String expected1 = "три";
        String expected2= "чотири";
        String expected3 = "сім";
        assertEquals(expected,oneDigit.transform(chars));
        assertEquals(expected1,oneDigit.transform(chars1));
        assertEquals(expected2,oneDigit.transform(chars2));
        assertEquals(expected3,oneDigit.transform(chars3));
    }
}