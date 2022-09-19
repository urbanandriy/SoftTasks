package Task1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ProgramLogicTest {
    ProgramLogic programLogic = new ProgramLogic();

    @Test
    void method() throws Exception {
        String s = """
                * * *
                 * *\s
                * * *
                 * *\s
                * * *
                """;
        String s1 = """
                * *
                 *\s
                * *
                """;
       Assertions.assertEquals(s, programLogic.method(5,5));
       Assertions.assertEquals(s1, programLogic.method(3,3));

    }
}