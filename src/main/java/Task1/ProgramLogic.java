package Task1;

import InputClases.InputClass;

public class ProgramLogic {
    public String method(int num1, int num2) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

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

