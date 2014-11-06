package Model;

public class ExchangeRate {

    private final Currency from;
    private final Currency to;
    private final int value;

    public ExchangeRate(Currency from, Currency to, int value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }
    
    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public int getValue() {
        return value;
    }
}