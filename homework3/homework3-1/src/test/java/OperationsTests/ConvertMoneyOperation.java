package OperationsTests;

import CardOperations.ConvertMoneyByExchangeRateOperation;
import Models.Card;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConvertMoneyOperation {
    private final ConvertMoneyByExchangeRateOperation convertMoneyByExchangeRateOperation = new ConvertMoneyByExchangeRateOperation();
    private final Card testCard = new Card("Some name", BigDecimal.valueOf(12));

    @Test
    public void testAddMoneyOperationWorkAsExpected() {
        BigDecimal expected = BigDecimal.valueOf(24.0);

        convertMoneyByExchangeRateOperation.convertMoney(2, testCard);

        BigDecimal actual = testCard.getBalance();

        assertEquals(actual, expected);
    }
}
