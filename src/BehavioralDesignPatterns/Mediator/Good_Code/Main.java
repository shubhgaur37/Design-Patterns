package BehavioralDesignPatterns.Mediator.Good_Code;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialise the Auction House
        AuctionMediator auctionHouse = new AuctionHouse();

        // Initialise Bidders
        Bidder bidder1 = new Bidder("Shubh",auctionHouse);
        Bidder bidder2 = new Bidder("Cuty",auctionHouse);
        Bidder bidder3 = new Bidder("Yash",auctionHouse);
        Bidder bidder4 = new Bidder("Sagar",auctionHouse);

        // Register Bidders with the mediator
        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);
        auctionHouse.registerBidder(bidder3);
        auctionHouse.registerBidder(bidder4);

        // Placing bids
        bidder1.placeBid(150);
        bidder2.placeBid(180);
        bidder3.placeBid(200);
        bidder4.placeBid(107);

        System.out.println("##################################");

        // Initialise the Extended Auction House 
        long biddingEndTime = System.currentTimeMillis() + 6000;

        AuctionMediator extendedAuctionHouse = new ExtendedAuctionHouse(biddingEndTime); 

        // Initialise Bidders
        Bidder bidder11 = new Bidder("Shubh",extendedAuctionHouse);
        Bidder bidder22 = new Bidder("Cuty",extendedAuctionHouse);
        Bidder bidder33 = new Bidder("Yash",extendedAuctionHouse);
        Bidder bidder44 = new Bidder("Sagar",extendedAuctionHouse);

        // Register Bidders with the mediator
        extendedAuctionHouse.registerBidder(bidder1);

        extendedAuctionHouse.registerBidder(bidder2);

        extendedAuctionHouse.registerBidder(bidder3);

        extendedAuctionHouse.registerBidder(bidder4);

        // Placing bids
        bidder11.placeBid(120);
        Thread.sleep(2000); // wait 2 seconds
        bidder22.placeBid(80);
        Thread.sleep(2000);
        bidder33.placeBid(3000);
        Thread.sleep(3000);
        bidder44.placeBid(5000);
    }
}

// Advantages:
// 1. Reduced Coupling: The mediator centralizes communication, so components don't directly interact with each other.
// Greater Modularity and less dependency on interconnections.
// 2. Simplified Communication: Single mediator manages all interactions. No more tangled webs of direct-to-direct object calls.
// 3. Enhanced Maintainability: All communication changes happen in one place(the mediator). 
// No need to update multiple classes, making updates easier.
// 4. Improved Scalability: Adding new components is effortless, as they only communicate with the mediator. Reduces integration issue as system grows.
// 5. Greater Reusability: Components are self-contained and reusable across different components.
// No hard-coded dependencies, making the system flexible.


