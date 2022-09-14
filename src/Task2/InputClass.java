package Task2;

import java.util.Scanner;

public class InputClass {
    Scanner scanner = new Scanner(System.in);
    Validation validation = new Validation();
    public Double input() throws Exception {
        double a = scanner.nextDouble();
        validation.validate(a);
        return a;
    }
}
