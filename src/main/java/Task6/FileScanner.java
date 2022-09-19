package Task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileScanner {
    public String[] scan(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        String sad = Files.readString(path);
        return sad.split(",");
    }
}
