package InputClases;

import java.util.Scanner;

public class InputClass {
    Scanner scanner = new Scanner(System.in);

    public String inputStr() {
        return scanner.nextLine();
    }

    public int inputInt() {
        return scanner.nextInt();
    }

    public double inputDouble() {
        return scanner.nextDouble();
    }
}
