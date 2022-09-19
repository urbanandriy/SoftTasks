package Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class FileScannerTest {
    FileScanner fileScanner = new FileScanner();

    @Test
    public void scan() throws IOException {
        String input = "C:\\Users\\aurba\\IdeaProjects\\FirstTasks\\src\\test\\java\\Task6\\TestFile6.txt";
        String[] expected = {"123123", "345345", "135222", "657688", "656786", "346576"};
        Assertions.assertArrayEquals(expected, fileScanner.scan(input));
    }

}