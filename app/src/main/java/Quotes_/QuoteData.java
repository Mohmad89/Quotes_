package Quotes_;

public class QuoteData {
    private String qotd_date;
    private Quote quote;

    public QuoteData(String quote_date, Quote quote) {
        this.qotd_date = quote_date;
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "QuoteData{" +
                "qotd_date='" + qotd_date + '\'' +
                ", quote=" + quote +
                '}';
    }
}
