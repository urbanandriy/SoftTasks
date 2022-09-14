package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {
    Scanner scanner = new Scanner(System.in);
    FirstValidation firstValidation = new FirstValidation();
    public Integer input() throws Exception {
        try {
            int num1 = scanner.nextInt();
            boolean valid = firstValidation.validation(num1);
            if (!valid) {
                throw new Exception("Please, enter positive numbers");
            } else return num1;
        } catch (InputMismatchException exception) {
            throw new Exception("Wrong input type, You can use only numbers");
        }
    }
}