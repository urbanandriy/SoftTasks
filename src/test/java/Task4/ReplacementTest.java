package Task4;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ReplacementTest {
Replacement replacement = new Replacement();
    @Test
    void replace() throws IOException {
        String[] input = {"C:\\Users\\aurba\\IdeaProjects\\FirstTasks\\src\\test\\java\\Task4\\Test.txt","WordOne","WordTwo"};
        replacement.replace(input);
        Path path = Paths.get("C:\\Users\\aurba\\IdeaProjects\\FirstTasks\\src\\test\\java\\Task4\\Test.txt");
        String sad = Files.readString(path);
        String expected = "Hello, WordTwo How are you? WordTwo";
        assertEquals(expected,sad);

    }
}