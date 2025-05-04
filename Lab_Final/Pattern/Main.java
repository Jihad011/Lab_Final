

public class Main {
    public static void main(String[] args) {
        Auctioneer auc = new Auctioneer();
        Bidder bidder1 = new Bidder(1);
        Bidder bidder2 = new Bidder(2);
        Bidder bidder3 = new Bidder(3);
        auc.notifier.register(bidder1);
        auc.notifier.register(bidder2);
        auc.notifier.register(bidder3);
        auc.placeBid(1000,bidder2);
    }
}
