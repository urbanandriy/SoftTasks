package Task7;

public class Row {
    public StringBuilder create(int n){
        StringBuilder stringBuilder = new StringBuilder();
        double stop = Math.sqrt(n);
        for(int i=1;i<stop;i++){
            stringBuilder.append(i).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder;
    }
}
