package ArodManagement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Lemon", 1600, 5200);
    }

    @AfterEach
    void tearDown() {
        product = null;
    }
    @Test
    void testProductConstructor(){
        Assertions.assertNotNull(product);
    }
    @Test
    void name() {
        Assertions.assertEquals("Lemon", product.name());
        Assertions.assertNotEquals("Banana", product.name());
    }

    @Test
    void amount() {
        Assertions.assertEquals(1600, product.amount());
        Assertions.assertNotEquals(2000, product.amount());
    }

    @Test
    void price() {
        Assertions.assertEquals(5200, product.price());
        Assertions.assertNotEquals(6000, product.price());
    }
}