package CardOperations;

import Models.Card;

import java.math.BigDecimal;

public class ConvertMoneyByExchangeRateOperation {
    public void convertMoney(double exchangeRate, Card card){
        card.setBalance(card.getBalance().multiply(BigDecimal.valueOf(exchangeRate)));
    }
}
