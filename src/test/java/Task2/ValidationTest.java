package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    Validation validation = new Validation();

    @Test
    void validate() throws Exception {
        assertEquals(3.5, validation.validate(3.5));
        Exception e = assertThrows(Exception.class, () -> {
                    validation.validate(-2);
                }
                , "Negative value!!! Try again with right one");
    }
}