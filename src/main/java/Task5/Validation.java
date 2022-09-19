package Task5;

public class Validation {
    public void validate(char[] chars) throws Exception {
        for (char c : chars) {
            if (!Character.isDigit(c) && c != '-') {
                throw new Exception("Wrong input");
            }
        }
    }
}
