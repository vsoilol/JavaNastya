package ATM;

import Models.Card;

import java.math.BigDecimal;

public class WithdrawMoneyOperation {
    public void withdrawMoney(int amountOfMoney, Card card){
        card.setBalance(card.getBalance().subtract(BigDecimal.valueOf(amountOfMoney)));
    }
}
