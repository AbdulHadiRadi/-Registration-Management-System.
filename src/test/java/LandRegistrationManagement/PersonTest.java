package LandRegistrationManagement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PersonTest {
    private Person buyer;
    private Person seller;

    @BeforeEach
    void setUp(){
        buyer = new Person("Buyer", "Malek",56521256);
        seller = new Person("Seller", "Jack",5445256);
    }
    @AfterEach
    public void tearDown(){
        buyer = null;
        seller = null;
    }
    @Test
    void testPersonConstructor(){
        Assertions.assertNotNull(buyer);
        Assertions.assertNotNull(seller);
    }
    @Test
    void testGetName() {
        Assertions.assertEquals("Malek", buyer.name());
        Assertions.assertNotEquals("Abdul", buyer.name());
        Assertions.assertEquals("Jack", seller.name());
        Assertions.assertNotEquals("Abdul", seller.name());
    }
    @Test
    void testGetNid() {
        Assertions.assertEquals(56521256, buyer.nid());
        Assertions.assertNotEquals(34101, buyer.nid());
        Assertions.assertEquals(5445256, seller.nid());
        Assertions.assertNotEquals(347751, seller.nid());
    }
    @Test
    void testGetStatus(){
        Assertions.assertEquals("Buyer", buyer.status());
        Assertions.assertNotEquals("Seller", buyer.status());
        Assertions.assertEquals("Seller", seller.status());
        Assertions.assertNotEquals("Buyer", seller.status());
    }
}