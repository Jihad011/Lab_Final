import java.util.ArrayList;
import java.util.List;

public class Notifier {
    public List<Bidder> bidders = new ArrayList<>();
    public void register(Bidder bidder) {
        bidders.add(bidder);
    }

    public void unregister(Bidder bidder) {
        bidders.remove(bidder);
    }

    public void notifyAllBidders(Bidder bidder , int price) {
        for (Bidder b : bidders) {
            if(b!=bidder)
            b.update(price,bidder.id);
        }
    }
}
