package propertyRegistrationManagement;
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
        Assertions.assertEquals("Malek", buyer.getName());
        Assertions.assertNotEquals("Abdul", buyer.getName());
        Assertions.assertEquals("Jack", seller.getName());
        Assertions.assertNotEquals("Abdul", seller.getName());
    }
    @Test
    public void testGetNid() {
        Assertions.assertEquals(56521256, buyer.getNid());
        Assertions.assertNotEquals(34101, buyer.getNid());
        Assertions.assertEquals(5445256, seller.getNid());
        Assertions.assertNotEquals(347751, seller.getNid());
    }
    @Test
    public void testGetStatus(){
        Assertions.assertEquals("Buyer", buyer.getStatus());
        Assertions.assertNotEquals("Seller", buyer.getStatus());
        Assertions.assertEquals("Seller", seller.getStatus());
        Assertions.assertNotEquals("Buyer", seller.getStatus());
    }
}