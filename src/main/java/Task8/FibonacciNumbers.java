package Task8;

public class FibonacciNumbers {
    public int[] generate(String input) {
        int[] ints = new int[Integer.parseInt(input)];
        ints[0] = 0;
        ints[1] = 1;
        for (int i = 2; i < ints.length; ++i) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints;
    }
}
