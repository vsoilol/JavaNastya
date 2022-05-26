import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidatorTests {
    private final Validator validator = new Validator();

    @Test
    public void testIsValidShouldReturnTrue() {
        String[] testParameters = {"1", "2", "3.4", "4.8"};

        assertTrue(validator.isValid(testParameters));
    }

    @Test
    public void testIsValidShouldReturnFalse() {
        String[] testParameters = {"1", "2", "g", "5.7"};

        assertFalse(validator.isValid(testParameters));
    }

    @Test
    public void testIsCorrectShouldReturnTrue(){
        String[] testParameters = {"1","2","3","4"};

        assertTrue(validator.isCorrect(testParameters));
    }

    @Test
    public void testIsCorrectShouldReturnFalse(){
        String[] testParameters = {"1","0","-6","5"};

        assertFalse(validator.isCorrect(testParameters));
    }
}
