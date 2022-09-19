package Task5;

import java.util.Arrays;

import static Task5.Library.*;

public class TwoDigit {
    public String transform(char[] chars) {
        if (Character.getNumericValue(chars[0]) == 1) {
            return teens[Character.getNumericValue(chars[1])];
        } else {
            String stringBuilder = numbers[1][Character.getNumericValue(chars[0])] + " " +
                    numbers[0][Character.getNumericValue(chars[1])];
            return stringBuilder.toString();
        }
    }

    public String transformThousands(char[] chars) {
        TwoDigit twoDigit = new TwoDigit();
        StringBuilder stringBuilder = new StringBuilder();
        switch (chars.length) {
            case 2:
                if (chars[0] == '1' || chars[1] == '0') {
                    stringBuilder = new StringBuilder("");
                    stringBuilder.append(twoDigit.transform(chars)).append(" тисяч ");
                    return stringBuilder.toString();
                } else if (chars[1] == '1') {
                    stringBuilder.append(numbers[1][Character.getNumericValue(chars[0])]).append(" ");
                    stringBuilder.append(difference[0][Character.getNumericValue(chars[1])]);
                    stringBuilder.append(" тисяча ");
                    return stringBuilder.toString();
                } else if (Character.getNumericValue(chars[1]) > 1 && Character.getNumericValue(chars[1]) < 5) {
                    stringBuilder.append(numbers[1][Character.getNumericValue(chars[0])]).append(" ");
                    stringBuilder.append(difference[0][Character.getNumericValue(chars[1])]);
                    stringBuilder.append(" тисячі ");
                    return stringBuilder.toString();
                } else if (Character.getNumericValue(chars[1]) > 5) {
                    stringBuilder.append(numbers[1][Character.getNumericValue(chars[0])]).append(" ");
                    stringBuilder.append(difference[0][Character.getNumericValue(chars[1])]);
                    stringBuilder.append(" тисяч ");
                    return stringBuilder.toString();

                }
            case 3:
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(numbers[2][Character.getNumericValue(chars[0])]).append(" ");
                char[] newArray = Arrays.copyOfRange(chars, 1, 3);
                stringBuilder1.append(transformThousands(newArray));
                return stringBuilder1.toString();
        }
        return null;
    }
}
