package Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Replacement {
    public void replace(String[] strings) throws IOException {
        String fileName = strings[0];
        String wordToChange = strings[1];
        String newWord = strings[2];
        Path path = Paths.get(fileName);
        Files.writeString(path,
                Files.readString(path).replace(wordToChange, newWord));
        System.out.println("done");
    }
}
