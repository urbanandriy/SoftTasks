package Task5;

import java.util.Arrays;

import static Task5.Library.numbers;

public class ThreeDigits {
    TwoDigit twoDigit = new TwoDigit();

    public String transform(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numbers[2][Character.getNumericValue(chars[0])]).append(" ");

        char[] newArray = Arrays.copyOfRange(chars, 1, 3);
        stringBuilder.append(twoDigit.transform(newArray));

        return stringBuilder.toString();
    }
}
