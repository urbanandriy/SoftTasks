package Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitTest {
TwoDigit twoDigit = new TwoDigit();
    @Test
    void transform() {
        char[] input ={'2','4'};
        String expected = "двадцать чотири";
        char[] input1 ={'9','9'};
        String expected1 = "дев'яносто дев'ять";
        char[] input2 = {'1','0'};
        String expected2 = "десять";
        char[] input3 ={'4','1'};
        String expected3 = "сорок один";
        assertEquals(expected,twoDigit.transform(input));
        assertEquals(expected1,twoDigit.transform(input1));
        assertEquals(expected2,twoDigit.transform(input2));
        assertEquals(expected3,twoDigit.transform(input3));
    }

    @Test
    void transformThousands() {
        char[] input ={'2','4'};
        String expected = "двадцять чотири тисячі ";
        char[] input1 ={'9','9'};
        String expected1 = "дев'яносто дев'ять тисяч ";
        char[] input2 = {'1','0'};
        String expected2 = "десять тисяч ";
        char[] input3 ={'4','1'};
        String expected3 = "сорок одна тисяча ";
        assertEquals(expected,twoDigit.transformThousands(input));
        assertEquals(expected1,twoDigit.transformThousands(input1));
        assertEquals(expected2,twoDigit.transformThousands(input2));
        assertEquals(expected3,twoDigit.transformThousands(input3));
    }
}