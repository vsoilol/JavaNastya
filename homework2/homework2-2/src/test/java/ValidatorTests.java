import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ValidatorTests {
    private final Validator validator = new Validator();

    @Test
    public void testIsValidShouldReturnTrue(){
        String[] testParameters = {"1","2","3"};

        assertTrue(validator.isValid(testParameters));
    }

    @Test
    public void testIsValidShouldReturnFalse(){
        String[] testParameters = {"1","2","g"};

        assertFalse(validator.isValid(testParameters));
    }

    @Test
    public void testIsCorrectShouldReturnTrue(){
        String[] testParameters = {"1","2","3"};

        assertTrue(validator.isCorrect(testParameters));
    }

    @Test
    public void testIsCorrectShouldReturnFalse(){
        String[] testParameters = {"1","4","3"};

        assertFalse(validator.isCorrect(testParameters));
    }
}
