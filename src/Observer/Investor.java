import java.util.ArrayList;
import java.util.List;

public class Investor {
    private String name;
    private List<Stock> stocks = new ArrayList<>();
    Investor(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void addStock(Stock stock) {
        stocks.add(stock);
    }
    void removeStocks(Stock stock) {
        stocks.remove(stock);
    }
    public void update(Stock stock, float price) {
        System.out.println("dear " + name + ", new price: " + price + " on the stock " + stock.getSymbol());
    }
    public String toString() {
        String s = "";
        for (Stock stock: stocks) {
            s += stock.getSymbol();
        }
        return "stocks of investor named " + name + ": " + s.substring(0, s.length() - 1);
    }
}
