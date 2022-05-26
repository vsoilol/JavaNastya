package Models;

import java.math.BigDecimal;

public class CreditCard extends Card{
    public CreditCard(String holderName, BigDecimal balance) {
        super(holderName, balance);
    }

    public CreditCard(String holderName){
        super(holderName);
    }

    @Override
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
