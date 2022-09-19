package Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourDigitsTest {
FourDigits fourDigits = new FourDigits();
    @Test
    void transform() {
        char[] chars = {'1','2','4','6'};
        char[] chars1 = {'3','3','0','0'};
        char[] chars2 = {'1','0','0','0'};
        char[] chars3 = {'7','7','6','6'};
        String expected = "одна тисяча двісті сорок шість";
        String expected1 ="три тисячі триста  ";
        String expected2 ="одна тисяча   ";
        String expected3 ="сім тисяч сімсот шістдесят шість";
        assertEquals(expected,fourDigits.transform(chars));
        assertEquals(expected1,fourDigits.transform(chars1));
        assertEquals(expected2,fourDigits.transform(chars2));
        assertEquals(expected3,fourDigits.transform(chars3));
    }
}