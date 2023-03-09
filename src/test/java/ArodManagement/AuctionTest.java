package ArodManagement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AuctionTest {
    private Product product;
    private Auction auction;
    @BeforeEach
    void setUp() {
        product = new Product("Banana", 20, 5000);
        auction = new Auction(product, 123, true);
    }
    @AfterEach
    void tearDown() {
        product = null;
        auction = null;
    }

    @Test
    void getProduct() {
        Product newPorduct = new Product("Lemon", 2000, 5000);
        Assertions.assertEquals(product, auction.product());
        Assertions.assertNotEquals(newPorduct, auction.product());
    }

    @Test
    void getBuyer() {
        Assertions.assertEquals(123, auction.buyer());
        Assertions.assertNotEquals(234, auction.buyer());
    }

    @Test
    void isPayment() {
        Assertions.assertTrue (auction.payment());
    }
}