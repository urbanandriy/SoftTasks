package Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.isEmpty() || !Character.isDigit(input.charAt(0))) {
            System.out.println("Empty input or wrong input type");
            throw new Exception("Write right value");
        }
        System.out.println(Arrays.toString(fibonacciNumbers.generate(input)));
    }
}
