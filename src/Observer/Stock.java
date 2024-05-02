import java.util.ArrayList;
import java.util.List;

public class Stock {
    String symbol;
    float price;
    private List<Investor> investors = new ArrayList<>();
    Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }
    public String getSymbol() {
        return this.symbol;
    }

    void register_investor(Investor investor) {
        investors.add(investor);
        investor.addStock(this);
    }
    void unregister_investor(Investor investor) {
        investors.remove(investor);
        investor.removeStocks(this);
    }
    void update_price(float price) {
        this.price = price;
        for (Investor investor: investors) {
            investor.update(this, price);
        }
    }
    public String toString() {
        String s = "";
        for (Investor investor : investors) {
            s += investor.getName() + ", ";
        }
        return "Investors that have this stock: " + s.substring(0, s.length() - 1);
    }
}
