package OperationsTests;

import CardOperations.AddMoneyOperation;
import Models.Card;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddMoneyTest {
    private final AddMoneyOperation addMoneyOperation = new AddMoneyOperation();
    private final Card testCard = new Card("Some name", BigDecimal.valueOf(12));

    @Test
    public void testAddMoneyOperationWorkAsExpected(){
        BigDecimal expected = BigDecimal.valueOf(22);

        addMoneyOperation.addMoney(10, testCard);

        BigDecimal actual = testCard.getBalance();

        assertEquals(actual, expected);
    }
}
