package Task3;

import java.util.Arrays;

public class StringParser {
    public String[] parse(String string) {
        string = string.replaceAll("<", "").replaceAll(">", "");
        return string.split(",");
    }
}
