package Task5;

import static Task5.Library.numbers;

public class OneDigit {
    public String transform(char[] chars) {
        return numbers[0][Character.getNumericValue(chars[0])];
    }
}
