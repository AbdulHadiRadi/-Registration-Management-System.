package LandRegistrationManagement;
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
        persons.add(new Person("Buyer","Malek", 39358));
        persons.add(new Person("Seller", "Jobbar", 174459));
        LandRegistered landRegistration = new LandRegistered();
        landRegistration.getBuildRegistraion().setDate(LocalDate.of(2002,6, 23)).setRegNumber(7001).setRegOffice("Sreemangal").setLand(lands).setPrice(2000000).setPersons(persons);
        Registration registration = landRegistration.getBuildRegistraion().builder();
        Assertions.assertNotNull(registration);
        Assertions.assertEquals(7001, registration.getRegNumber());
        Assertions.assertEquals("Sreemangal", registration.getRegOffice());
        Assertions.assertEquals(2000000, registration.getPrice());
        Assertions.assertEquals(LocalDate.parse("2002-06-23"), registration.getDate());
        Assertions.assertEquals("Malek", registration.getPersons().getFirst().name());
        Assertions.assertEquals("Ruposhpur", registration.getLand().getFirst().getArea());
    }
}