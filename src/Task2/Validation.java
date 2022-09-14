package Task2;

public class Validation {
    public void validate(double a) throws Exception {
        if(a<=0){
            throw new Exception("Negative value!!! Try again with right one");
        }
    }
}
