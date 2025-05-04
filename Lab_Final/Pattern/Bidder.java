

public class Bidder implements Hearer {
    public int id;
    private int currentPrice = 0;

    public Bidder(int id) {
        this.id = id;
    }

    @Override
    public void update(int price,int id) {
        if (price > currentPrice) {
            currentPrice = price;
            System.out.println("Bidder " + this.id + ": New bid of " + price+ "from Bidder: "+id);
        }
    }
}
