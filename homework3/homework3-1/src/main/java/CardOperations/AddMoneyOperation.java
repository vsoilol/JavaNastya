package CardOperations;

import Models.Card;

import java.math.BigDecimal;

public class AddMoneyOperation {
    public void addMoney(int amountOfMoney, Card card){
        card.setBalance(card.getBalance().add(BigDecimal.valueOf(amountOfMoney)));
    }
}
