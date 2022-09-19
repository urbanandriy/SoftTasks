package Task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeMagicTest {

   DegreeMagic degreeMagic = new DegreeMagic();
    @Test
    void calculate() {
        assertEquals(25,degreeMagic.calculate(5,2));
        assertEquals(16,degreeMagic.calculate(4,2));
        assertEquals(125,degreeMagic.calculate(5,3));
        assertEquals(256,degreeMagic.calculate(2,8));

    }
}