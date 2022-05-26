import Models.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTests {
    private CreditCard creditCard;

    @BeforeEach
    public void init() {
        this.creditCard = new CreditCard("Nastya", BigDecimal.valueOf(50));
    }

    @Test
    public void testSetBalanceShouldWorkAsExpected() {
        BigDecimal balance = BigDecimal.valueOf(100.9541512);

        creditCard.setBalance(balance);
        BigDecimal actual = creditCard.getBalance();

        assertEquals(balance, actual);
    }
}
