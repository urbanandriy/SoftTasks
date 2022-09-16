package Task5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        OneDigit oneDigit = new OneDigit();
        TwoDigit twoDigit = new TwoDigit();
        Hundreds hundreds = new Hundreds();
        FourDigits fourDigits = new FourDigits();
        FiveDigits fiveDigits = new FiveDigits();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String n1 = scanner.next();
        char[] chars = n1.toCharArray();
        int sw = chars.length;
        switch (sw) {
            case 1 -> System.out.println(oneDigit.transform(chars));
            case 2 -> System.out.println(twoDigit.transform(chars));
            case 3 -> System.out.println(hundreds.transform(chars));
            case 4 -> System.out.println(fourDigits.transform(chars));
            case 5, 6 -> System.out.println(fiveDigits.transform(chars));
        }
    }
}
