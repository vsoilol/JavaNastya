package ValidatorsTests;

import Validators.ValuesValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValuesValidatorTest {
    private final ValuesValidator validator = new ValuesValidator();

    @Test
    public void testIsValidShouldReturnTrue(){
        String testValue = "3.4";

        assertTrue(validator.isValid(testValue));
    }

    @Test
    public void testIsValidShouldReturnFalse(){
        String testValue = "fgwh";

        assertFalse(validator.isValid(testValue));
    }
}
