package OperationsTests;

import CardOperations.WithdrawMoneyOperation;
import Models.Card;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WithdrawOperationTest {
    private final WithdrawMoneyOperation withdrawMoneyOperation = new WithdrawMoneyOperation();
    private final Card testCard = new Card("Some name", BigDecimal.valueOf(12));

    @Test
    public void testAddMoneyOperationWorkAsExpected(){
        BigDecimal expected = BigDecimal.valueOf(2);

        withdrawMoneyOperation.withdrawMoney(10, testCard);

        BigDecimal actual = testCard.getBalance();

        assertEquals(actual, expected);
    }
}
