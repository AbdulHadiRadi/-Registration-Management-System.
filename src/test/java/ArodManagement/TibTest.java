package ArodManagement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;


class TibTest {
    private Product product;
    private Auction auction;
    private final List<Auction> auctions = new LinkedList<Auction>();
    private Tib tib;
    @BeforeEach
    void setUp() {
        auction = new Auction(product, 123, true);
        product = new Product("Banana", 20, 5000);
        auctions.add(auction);
        tib = new Tib(103, 100, auctions);
    }
    @AfterEach
    void tearDown() {
        product = null;
        auctions.clear();
    }


    @Test
    void getGarden() {
        Assertions.assertEquals(103, tib.getGarden());
        Assertions.assertNotEquals(100, tib.getGarden());
    }

    @Test
    void getJeep() {
        Assertions.assertEquals(100, tib.getJeep());
        Assertions.assertNotEquals(103, tib.getJeep());
    }

    @Test
    void getAuctions() {
        Assertions.assertEquals(auction, tib.getAuctions().get(0));
        Assertions.assertNotEquals(100, tib.getAuctions().get(0));
    }
}