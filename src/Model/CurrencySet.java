package Model;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CurrencySet implements Iterable<Currency> {
    private final Map<Currency, String> map;

    public CurrencySet() {
        map = new HashMap<>();
    }

    public Map<Currency, String> getMap() {
        return map;
    }
    
    public void add(Currency currency) {
        map.put(currency, currency.getName());     
    }
    
    public int size() {
        return map.size();
    }
    
    public Currency getCurrency(String name){   
        for (Currency currency : map.keySet()) {
            if (currency.getName().equals(name)) {
                return currency;
            }
        }               
        return null;
    }

    @Override
    public Iterator<Currency> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}