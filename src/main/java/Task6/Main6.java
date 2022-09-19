package Task6;

import java.io.IOException;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        KyivMode kyivMode = new KyivMode();
        LvivMode lvivMode = new LvivMode();
        FileScanner fileScanner = new FileScanner();
        ParseStringsToChars parseStringsToChars = new ParseStringsToChars();
        Result result = new Result();


        System.out.println("Please enter path to file: ");
        String enterFileName = scanner.next();
        System.out.println("""
                Enter mode:
                1)KyivMode
                2)LvivMode""");
        String enterMode = scanner.next();

        char[][] allWords = parseStringsToChars.parse(fileScanner.scan(enterFileName));

        switch (Integer.parseInt(enterMode)) {
            case 1 -> kyivMode.determine(allWords);
            case 2 -> lvivMode.determine(allWords);
            default -> System.out.println("Wrong mode. Try one more");
        }
        System.out.println("Result is: ");
        System.out.println(result.resultCounter());
    }
}
