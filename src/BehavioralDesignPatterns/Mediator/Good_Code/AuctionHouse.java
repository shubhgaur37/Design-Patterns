package BehavioralDesignPatterns.Mediator.Good_Code;

import java.util.ArrayList;
import java.util.List;


public class AuctionHouse implements AuctionMediator {
    private List<Bidder> bidders;

    public AuctionHouse(){
        bidders = new ArrayList<Bidder>();
    }
    @Override
    public void registerBidder(Bidder bidder){
        bidders.add(bidder);
    }
    @Override
    public void placeBid(Bidder bidder, int amount){
        System.out.println("Bidder: "+bidder.getName()+" placed a bid of :"+ amount);
        for(Bidder b: bidders) {
            if (b != bidder)
                b.receiveBid(bidder, amount);
        }
    }
}
