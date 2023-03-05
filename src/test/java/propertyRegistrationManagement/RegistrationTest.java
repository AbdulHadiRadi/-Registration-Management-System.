package propertyRegistrationManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.LinkedList;


class RegistrationTest {
    Survey rs = new Survey(1201, 980);
    Land land = new Land("Ruposhpur", 5, rs);
    LinkedList<Land> lands = new LinkedList<>();
    LinkedList<Person> persons = new LinkedList<>();
    @Test
    public void testRegistrationBuilder() {
        lands.add(land);
        persons.add(new Buyer("Malek", 39358));
        persons.add(new Seller("Jobbar", 174459));
        RegistrationBuilder buildReg = new RegistrationBuilder();
        Registration registration = buildReg.setDate(LocalDate.of(2002,6, 23)).setRegNumber(7001).setRegOffice("Sreemangal").setLand(lands).setPrice(2000000).setPersons(persons).builder();
        Assertions.assertNotNull(registration);
        Assertions.assertEquals(7001, registration.getRegNumber());
        Assertions.assertEquals("Sreemangal", registration.getRegOffice());
        Assertions.assertEquals(2000000, registration.getPrice());
        Assertions.assertNotEquals(registration.getPersons().get(0).getClass(), registration.getPersons().get(1).getClass());
    }
}