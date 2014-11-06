package Control;

import Model.Currency;
import Model.CurrencySet;
import Model.Money;
import UI.ExchangeDialog;
import java.io.IOException;

public class ExchangeOperation {
    private final CurrencySet currencySet;

    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public void execute() {
        Money moneyReaded = readMoney();
        Currency currencyReaded = readCurrency();
        
    }
    
    private Money readMoney() throws IOException{
        ExchangeDialog.executeMoneyDialog();
        return ExchangeDialog.getMoney();
        ExchangeRate exchangeRate = ExchangeRateLoader().load(money.getCurrency(), currency);
    }
    
    private Currency readCurrency() throws IOException{
        ExchangeDialog.executeCurrencyDialog();
        return ExchangeDialog.getCurrency();
    }

    
}