

public class Auctioneer {
    Notifier notifier;
    int currentPrice=0;

    public Auctioneer(){
        this.notifier= new Notifier();
    }
    public void placeBid(int price,Bidder bidder) {
        currentPrice = price;
        notifier.notifyAllBidders(bidder, price);
    }

}
