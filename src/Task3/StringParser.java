package Task3;

public class StringParser {
    public String[] parse(String string){
        string=string.replaceAll("<","").replaceAll(">","");
        return string.split(",");
    }
}
