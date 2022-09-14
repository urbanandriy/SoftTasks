package Task1;

import java.util.Scanner;

public class LogicClass1 {
    FirstValidation firstValidation = new FirstValidation();
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    InputClass inputClass = new InputClass();
    public String method() throws Exception {
           int num1 = inputClass.input();
           int num2 = inputClass.input();
            for (int i = 0; i < num1; i++) {
                for (int y = 0; y < num2; y++) {
                    if ((i + y) % 2 != 0) {
                        stringBuilder.append(" ");
                    } else {
                        stringBuilder.append("*");
                    }
                }
                stringBuilder.append("\n");
            }
        return stringBuilder.toString();
}
}

