package ValidatorsTests;

import Validators.ExchangeRateValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ExchangeRateValidatorTests {
    private final ExchangeRateValidator validator = new ExchangeRateValidator();

    @Test
    public void testIsValidShouldReturnTrue(){
        assertTrue(validator.isValid(12.5));
    }

    @Test
    public void testIsValidShouldReturnFalse(){
        assertFalse(validator.isValid(0));
    }
}
