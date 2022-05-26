import ConsoleProviders.UIProvider;
import Models.Card;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Card card = new Card("Some name", BigDecimal.valueOf(60));

        UIProvider uiProvider = new UIProvider();
        uiProvider.showMenu(card);
    }
}
