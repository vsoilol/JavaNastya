package ConsoleProviders;

import CardOperations.AddMoneyOperation;
import CardOperations.ConvertMoneyByExchangeRateOperation;
import CardOperations.WithdrawMoneyOperation;
import Models.Card;
import Resources.ExceptionMessages;
import Resources.OutputResources;

public class UIProvider {
    private final ConsoleReader consoleReader = new ConsoleReader();
    private final AddMoneyOperation addMoneyOperation = new AddMoneyOperation();
    private final WithdrawMoneyOperation withdrawMoneyOperation = new WithdrawMoneyOperation();
    private final ConvertMoneyByExchangeRateOperation convertMoneyByExchangeRateOperation = new ConvertMoneyByExchangeRateOperation();

    public void showMenu(Card card){
        boolean isRun = true;

        while(isRun){
            System.out.print(OutputResources.MENU_ITEMS);
            switch (consoleReader.getText(OutputResources.CHOOSE_MENU_ITEM)){
                case "1" -> System.out.print(card.getBalance());
                case "2" -> addMoneyOperation.addMoney(consoleReader.getValue(OutputResources.INPUT_AMOUNT_OF_MONEY), card);
                case "3" -> withdrawMoneyOperation.withdrawMoney(consoleReader.getValue(OutputResources.INPUT_AMOUNT_OF_MONEY), card);
                case "4" -> convertMoneyByExchangeRateOperation.convertMoney(consoleReader.getExchangeRate(OutputResources.INPUT_EXCHANGE_RATE), card);
                case "5" -> isRun = false;
                default -> System.out.print(ExceptionMessages.INCORRECT_INPUT);
            }
        }
    }
}
