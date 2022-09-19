package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


class FirstValidationTest {
    FirstValidation firstValidation = new FirstValidation();

    @Test
    void validation() throws Exception {
        Assertions.assertEquals(4, firstValidation.validation(4));
        Exception e = assertThrows(Exception.class, () -> {
                    firstValidation.validation(-2);
                }
                , "Negative value!!! Try again with right one");
    }
}