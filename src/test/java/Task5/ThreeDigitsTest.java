package Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDigitsTest {
ThreeDigits threeDigits = new ThreeDigits();
    @Test
    void transform() {
        char[] chars = {'1','2','4'};
        char[] chars1 = {'3','3','3'};
        char[] chars2 = {'1','6','7'};
        char[] chars3 = {'7','7','6'};
        String expected = "сто двадцять чотири";
        String expected1 ="триста тридцять три";
        String expected2 ="сто шістдесят сім";
        String expected3 ="сімсот сімдесят шість";

        assertEquals(expected,threeDigits.transform(chars));
        assertEquals(expected1,threeDigits.transform(chars1));
        assertEquals(expected2,threeDigits.transform(chars2));
        assertEquals(expected3,threeDigits.transform(chars3));
    }
}