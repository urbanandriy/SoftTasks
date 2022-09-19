package Task2;

import InputClases.InputClass;

import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);
        InputClass inputClass = new InputClases.InputClass();
        String stop = "yes";
        while (Objects.equals(stop, "yes")) {
            System.out.println("Enter 4 parameters(2 for each envelop");
            double a1 = validation.validate(inputClass.inputDouble());
            double b1 = validation.validate(inputClass.inputDouble());
            System.out.println("2 Envelop");
            double a2 = validation.validate(inputClass.inputDouble());
            double b2 = validation.validate(inputClass.inputDouble());
            if (a2 > a1 && b2 > b1) {
                System.out.println("Envelop #number2 is bigger-> It is possible to put first one inside second");
            } else if (a1 > a2 && b1 > b2) {
                System.out.println("Envelop #number1 is bigger-> It is possible to put second one inside first");
            } else if (a1 == a2 && b1 == b2) {
                System.out.println("Envelops are with the same parameters");
            } else {
                System.out.println("Envelops are different you cant put one inside another");
            }
            System.out.println("Do you want to continue?");
            stop = scanner.next().toLowerCase();
        }
    }
}
