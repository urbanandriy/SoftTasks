package Task5;

import java.util.Arrays;

import static Task5.Library.difference;

public class FourDigits {
    ThreeDigits threeDigits = new ThreeDigits();

    public String transform(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(difference[0][Character.getNumericValue(chars[0])]).append(" ");
        if (Character.getNumericValue(chars[0]) == 1) {
            stringBuilder.append(difference[1][0]).append(" ");
        } else if (Character.getNumericValue(chars[0]) < 5) {
            stringBuilder.append(difference[1][1]).append(" ");
        } else {
            stringBuilder.append(difference[1][2]).append(" ");
        }

        char[] newArray = Arrays.copyOfRange(chars, 1, 4);
        stringBuilder.append(threeDigits.transform(newArray));
        return stringBuilder.toString();

    }
}
