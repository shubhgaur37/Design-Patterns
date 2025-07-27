package BehavioralDesignPatterns.Mediator.Good_Code;

public interface AuctionMediator {
    // to register a bidder with mediator
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, int amount);   
}
