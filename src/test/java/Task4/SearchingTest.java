package Task4;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SearchingTest {
Searching searching = new Searching();
    @Test
    void search() throws IOException {
        String[] input = {"C:\\Users\\aurba\\IdeaProjects\\FirstTasks\\src\\test\\java\\Task4\\Test.txt","How"};
        assertEquals(1,searching.search(input));
    }
}