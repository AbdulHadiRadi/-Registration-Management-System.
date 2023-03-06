package LandRegistrationManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {
    Person buyer = new Person("Buyer", "Malek",56521256);
    Person seller = new Person("Seller", "Jack",5445256);
    @Test
    public void testPersonConstructor(){
        Assertions.assertNotNull(buyer);
        Assertions.assertNotNull(seller);
    }
    @Test
    public void testGetName() {
        Assertions.assertEquals("Malek", buyer.name());
        Assertions.assertNotEquals("Abdul", buyer.name());
        Assertions.assertEquals("Jack", seller.name());
        Assertions.assertNotEquals("Abdul", seller.name());
    }
    @Test
    public void testGetNid() {
        Assertions.assertEquals(56521256, buyer.nid());
        Assertions.assertNotEquals(34101, buyer.nid());
        Assertions.assertEquals(5445256, seller.nid());
        Assertions.assertNotEquals(347751, seller.nid());
    }
    @Test
    public void testGetStatus(){
        Assertions.assertEquals("Buyer", buyer.status());
        Assertions.assertNotEquals("Seller", buyer.status());
        Assertions.assertEquals("Seller", seller.status());
        Assertions.assertNotEquals("Buyer", seller.status());
    }
}