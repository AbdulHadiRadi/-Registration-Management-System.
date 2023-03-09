package ArodManagement;

public class Commission{
    //Can use HashMap to store auction id with commission;
    private final Auction auction;

    public Commission(Auction auction) {
        this.auction = auction;
    }

    public int getCommission(){
        return auction.product().price()*5/100;
    }
}
