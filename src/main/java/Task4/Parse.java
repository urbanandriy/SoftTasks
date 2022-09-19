package Task4;

public class Parse {
    public String[] parseString(String s) {
        return s.replace("<", "").split(">");
    }
}
