package ArodManagement;
import java.util.List;

public class Tib {
    private int garden;
    private int jeep;
    private List<Auction> auctions;

    public Tib(int garden, int jeep, List<Auction> auctions) {
        this.garden = garden;
        this.jeep = jeep;
        this.auctions = auctions;
    }

    public int getGarden() {
        return garden;
    }

    public int getJeep() {
        return jeep;
    }

    public List<Auction> getAuctions() {
        return auctions;
    }

}
