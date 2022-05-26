package ValidatorsTests;

import Validators.ValuesValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValuesValidatorTests {
    private final ValuesValidator validator = new ValuesValidator();

    @Test
    public void testIsValidShouldReturnTrue(){
        assertTrue(validator.isValid("12"));
    }

    @Test
    public void testIsValidShouldReturnFalse(){
        assertFalse(validator.isValid("12saef2"));
    }
}
