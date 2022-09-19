package Task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {
Row row = new Row();
    @Test
    void create() {
        String s1 = "1,2,3,4,5";
        String s2 = "1,2,3";
        String s3 = "1,2,3,4,5,6,7,8,9,10,11,12,13";
        assertEquals(s1,row.create(27));
        assertEquals(s2,row.create(16));
        assertEquals(s1,row.create(27));
        assertEquals(s3,row.create(171));
        assertEquals(s1,row.create(35));
    }
}