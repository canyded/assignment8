
public class Main {
    public static void main(String[] args) {
        Investor investor = new Investor("Arman");
        Investor investor1 = new Investor("Olzhas");
        Investor investor2 = new Investor("Miras");

        Stock stock = new Stock("ALLpasd", 10);

        stock.register_investor(investor);
        stock.register_investor(investor1);
        stock.register_investor(investor2);

        stock.update_price(14);

        Stock stock2 = new Stock("SDDSD", 10);
        System.out.println(stock);
        System.out.println(investor);
    }
}