package Models;

import Resources.ExceptionMessages;

import java.math.BigDecimal;

public class DebitCard extends Card{
    public DebitCard(String holderName, BigDecimal balance) {
        super(holderName, balance);
    }

    @Override
    public void setBalance(BigDecimal balance) {
        if(balance.compareTo(BigDecimal.valueOf(0)) < 0){
            throw new NumberFormatException(ExceptionMessages.CANNOT_SET_NEGATIVE_BALANCE);
        }

        this.balance = balance;
    }
}
