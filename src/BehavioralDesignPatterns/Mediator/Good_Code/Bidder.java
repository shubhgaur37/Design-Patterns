package BehavioralDesignPatterns.Mediator.Good_Code;

public class Bidder {
    private String name;
    private AuctionMediator auctionMediator;


    public Bidder(String name, AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    public String getName(){
        return name;
    }

    public void placeBid(int amount){
        auctionMediator.placeBid(this, amount);
    }

    public void receiveBid(Bidder bidder, int amount){
        // Notification Log
        System.out.println(name+" is notfied: "+ bidder.getName()+ " placed a bid of:"+ amount);
    }

}
