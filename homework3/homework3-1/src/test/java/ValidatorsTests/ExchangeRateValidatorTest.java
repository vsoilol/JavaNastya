package ValidatorsTests;

import Validators.ExchangeRateValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExchangeRateValidatorTest {
    private final ExchangeRateValidator validator = new ExchangeRateValidator();

    @Test
    public void testIsValidShouldReturnTrue(){
        double testValue = 3.2;

        assertTrue(validator.isValid(testValue));
    }

    @Test
    public void testIsValidShouldReturnFalse(){
        double testValue = 0;

        assertFalse(validator.isValid(testValue));
    }
}
