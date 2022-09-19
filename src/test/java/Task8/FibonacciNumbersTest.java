package Task8;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumbersTest {
FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
    @Test
    void generate() {
        String input = "5";
        int[] expected = {0,1,1,2,3};
        String input1 = "8";
        int[] expected1 = {0,1,1,2,3,5,8,13};
        assertArrayEquals(expected,fibonacciNumbers.generate(input));
        assertArrayEquals(expected1,fibonacciNumbers.generate(input1));
    }
}