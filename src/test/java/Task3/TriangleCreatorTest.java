package Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleCreatorTest {
    TriangleCreator triangleCreator = new TriangleCreator();
    @Test
    void create() {
        Triangle t1 = new Triangle("A",5,2,4);
        Triangle t2 = new Triangle("B",5,7,6);
        String[] s1 = {"A","5","2","4"};
        String[] s2 = {"B","5","7","6"};
        assertEquals(t1,triangleCreator.create(s1));
        assertEquals(t2,triangleCreator.create(s2));
    }
}