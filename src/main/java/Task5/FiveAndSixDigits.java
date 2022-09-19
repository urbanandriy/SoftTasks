package Task5;

import java.util.Arrays;

public class FiveAndSixDigits {
    ThreeDigits threeDigits = new ThreeDigits();
    TwoDigit twoDigit = new TwoDigit();

    public String transform(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();

        switch (chars.length) {
            case 5 -> {
                char[] newArray1 = Arrays.copyOfRange(chars, 0, 2);
                stringBuilder.append(twoDigit.transformThousands(newArray1));
                char[] newArray2 = Arrays.copyOfRange(chars, 2, 5);
                stringBuilder.append(threeDigits.transform(newArray2));
                return stringBuilder.toString();
            }
            case 6 -> {
                char[] newArray3 = Arrays.copyOfRange(chars, 0, 3);
                stringBuilder.append(twoDigit.transformThousands(newArray3));
                char[] newArray4 = Arrays.copyOfRange(chars, 3, 6);
                stringBuilder.append(threeDigits.transform(newArray4));
                return stringBuilder.toString();
            }
        }
        return null;
    }

}
