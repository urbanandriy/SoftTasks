package Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveAndSixDigitsTest {
FiveAndSixDigits fiveAndSixDigits = new FiveAndSixDigits();
    @Test
    void transform() {
        char[] chars = {'1','0','4','6','6'};
        char[] chars1 = {'6','0','0','0','0'};
        char[] chars2 = {'4','0','7','3','3'};
        char[] chars3 = {'1','3','6','0','0','0'};

        String expected = "десять тисяч чотириста шістдесят шість";
        String expected1 ="шістдесят  тисяч   ";
        String expected2 ="сорок  тисяч сімсот тридцять три";
        String expected3 ="сто тридцять шість тисяч   ";

        assertEquals(expected, fiveAndSixDigits.transform(chars));
        assertEquals(expected1, fiveAndSixDigits.transform(chars1));
        assertEquals(expected2, fiveAndSixDigits.transform(chars2));
        assertEquals(expected3, fiveAndSixDigits.transform(chars3));
    }
}