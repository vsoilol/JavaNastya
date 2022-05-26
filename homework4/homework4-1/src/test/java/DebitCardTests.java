import Models.DebitCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DebitCardTests {
    private DebitCard debitCard;

    @BeforeEach
    public void init() {
        this.debitCard = new DebitCard("Nastya", BigDecimal.valueOf(50));
    }

    @Test
    public void testSetBalanceShouldWorkAsExpected() {
        BigDecimal balance = BigDecimal.valueOf(100.9541512);

        debitCard.setBalance(balance);
        BigDecimal actual = debitCard.getBalance();

        assertEquals(balance, actual);
    }

    @Test
    public void testSetBalanceShouldThrowException() {
        assertThrows(NumberFormatException.class, () -> debitCard.setBalance(BigDecimal.valueOf(-50)));
    }
}
