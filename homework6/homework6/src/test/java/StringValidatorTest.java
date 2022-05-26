import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTest {
    private final StringValidator stringValidator = new StringValidator();
    private final String testText1 = "some test text 1";
    private final String testText2 = "some new test text";

    @Test
    public void testStringValidatorShouldReturnFalse(){
        assertFalse(stringValidator.validate(testText1));
    }

    @Test
    public void testStringValidatorShouldReturnTrue(){
        assertTrue(stringValidator.validate(testText2));
    }
}
