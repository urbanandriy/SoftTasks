package Task9;

public class DegreeMagic {
    public int calculate(int a, int b){
        int result = a;
        for(int i=1; i<b; i++){
            result=result*a;
        }
        return result;
    }
}
