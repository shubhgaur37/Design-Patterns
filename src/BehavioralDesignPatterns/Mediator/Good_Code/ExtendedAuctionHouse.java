package BehavioralDesignPatterns.Mediator.Good_Code;

// Extending Mediator Functionality to add new features adhering to Open/Closed Principle
public class ExtendedAuctionHouse extends AuctionHouse {
    private long biddingEndTime; // defines the time when bidding ends

    public ExtendedAuctionHouse(long biddingEndTime){
        this.biddingEndTime = biddingEndTime;
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        // Adding extra functionalities such as biddingEndTime and Logging
        // Check if bidding is still taking place
        if (System.currentTimeMillis() > biddingEndTime){
            System.out.println("Bidding time is over!! No More Bids Please");
            return;
        }
        System.out.println("LOG : "+ bidder.getName()+" is bidding amount "+ amount);

        super.placeBid(bidder, amount);
    }

}
