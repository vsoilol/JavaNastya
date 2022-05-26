import ConsoleProviders.UIProvider;
import Models.CreditCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        CreditCard creditCard = new CreditCard("Some name", BigDecimal.valueOf(60));

        UIProvider uiProvider = new UIProvider();
        uiProvider.showMenu(creditCard);
    }
}
