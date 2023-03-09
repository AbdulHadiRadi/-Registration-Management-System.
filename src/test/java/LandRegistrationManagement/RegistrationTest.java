package LandRegistrationManagement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


class RegistrationTest {
    private Survey rs;
    private Land land;
    List<Land> lands = new LinkedList<>();
    List<Person> persons = new LinkedList<>();

    @BeforeEach
    void setUp(){
        rs = new Survey(1201, 980);
        land = new Land("Ruposhpur", 5, rs);
        lands.add(land);
        persons.add(new Person("Buyer","Malek", 39358));
        persons.add(new Person("Seller", "Jobbar", 174459));
    }
    @AfterEach
    void tearDown(){
        rs = null;
        land = null;
        persons.clear();
    }
    @Test
    public void testRegistrationBuilder() {
        RegisteredLand landRegistration = new RegisteredLand();
        landRegistration.getBuildRegistraion().setDate(LocalDate.of(2002,6, 23)).setRegNumber(7001).setRegOffice("Sreemangal").setLand(lands).setPrice(2000000).setPersons(persons);
        Registration registration = landRegistration.getBuildRegistraion().builder();
        Assertions.assertNotNull(registration);
        Assertions.assertEquals(7001, registration.getRegNumber());
        Assertions.assertEquals("Sreemangal", registration.getRegOffice());
        Assertions.assertEquals(2000000, registration.getPrice());
        Assertions.assertEquals(LocalDate.parse("2002-06-23"), registration.getDate());
    }
}