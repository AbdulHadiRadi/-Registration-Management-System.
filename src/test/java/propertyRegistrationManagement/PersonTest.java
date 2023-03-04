package propertyRegistrationManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {
    Person person = new Person("Malek",56521256);
    @Test
    public void testPersonConstructor(){
        Assertions.assertNotNull(person);
    }
    @Test
    public void testGetName() {
        Assertions.assertEquals("Malek", person.name());
        Assertions.assertNotEquals("Abdul", person.name());
    }
    @Test
    public void testGetAmount() {
        Assertions.assertEquals(56521256, person.nid());
        Assertions.assertNotEquals(34101, person.nid());
    }

}