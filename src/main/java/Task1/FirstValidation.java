package Task1;

public class FirstValidation {
    public int validation(int num) throws Exception {
        if (num <= 0) {
            throw new Exception("Enter only positive numbers!");
        } else return num;
    }
}
