package Task5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) throws Exception {
        Validation validation = new Validation();
        OneDigit oneDigit = new OneDigit();
        TwoDigit twoDigit = new TwoDigit();
        ThreeDigits threeDigits = new ThreeDigits();
        FourDigits fourDigits = new FourDigits();
        FiveAndSixDigits fiveAndSixDigits = new FiveAndSixDigits();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();

        System.out.println("Enter number: ");
        char[] inputChars = scanner.next().toCharArray();
        validation.validate(inputChars);
        char[] chars = positiveOrNegative.refactorArray(inputChars);
        stringBuilder.append(positiveOrNegative.addMark(inputChars));
        int sw = chars.length;
        switch (sw) {
            case 1 -> stringBuilder.append(oneDigit.transform(chars));
            case 2 -> stringBuilder.append(twoDigit.transform(chars));
            case 3 -> stringBuilder.append(threeDigits.transform(chars));
            case 4 -> stringBuilder.append(fourDigits.transform(chars));
            case 5, 6 -> stringBuilder.append(fiveAndSixDigits.transform(chars));
        }
        System.out.println(stringBuilder);
    }
}
