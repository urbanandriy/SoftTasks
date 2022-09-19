package Task5;

import java.util.Arrays;

public class PositiveOrNegative {
    public char[] refactorArray(char[] chars) {
        if (chars[0] == '-') {
            return Arrays.copyOfRange(chars, 1, chars.length);
        }
        return chars;
    }

    public String addMark(char[] chars) {
        if (chars[0] == '-') {
            return "мінус ";
        } else return "";
    }
}
