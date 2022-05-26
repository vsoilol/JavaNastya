package Models;

import java.math.BigDecimal;

public class Card {
    private String holderName;
    private BigDecimal balance;

    public Card(String holderName, BigDecimal balance){
        this.balance = balance;
        this.holderName = holderName;
    }

    public Card(String holderName){
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
