package Models;

import java.math.BigDecimal;

public abstract class Card {
    private String holderName;
    protected BigDecimal balance;

    public Card(String holderName, BigDecimal balance){
        this.balance = balance;
        this.holderName = holderName;
    }

    public Card(String holderName){
        this.holderName = holderName;
    }

    public abstract void setBalance(BigDecimal balance);

    public BigDecimal getBalance() {
        return balance;
    }
}
