package Task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrintingTest {
Printing printing = new Printing();
    @Test
    void print() {
        ArrayList<Triangle> arrayList = new ArrayList<>();
        arrayList.add( new Triangle("A",5,2,4));
        arrayList.add( new Triangle("B",5,7,6));
        arrayList.add( new Triangle("C",6.2,2.4,4));
        arrayList.add( new Triangle("D",4.9,7.1,6.9));
        String string=
                """
                        ========Triangles list:==========
                        0)  A-->>64.48255578061404
                        1)  B-->>175.7498221905217
                        2)  C-->>84.10553370617178
                        3)  D-->>193.5648728462889
                        """;
        assertEquals(string,printing.print(arrayList));
    }
}