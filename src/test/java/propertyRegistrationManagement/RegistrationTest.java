package propertyRegistrationManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.LinkedList;


class RegistrationTest {
    LinkedList<Land> lands = new LinkedList<>();
    LinkedList<Person> buyer = new LinkedList<>();
    LinkedList<Person> seller = new LinkedList<>();
    @Test
    public void testRegistrationBuilder() {
        Survey rs = new Survey(1201, 980);
        Land land = new Land("Ruposhpur", 5, rs);
        lands.add(land);
        buyer.add(new Person("Malek", 39358));
        seller.add(new Person("Jobbar", 174459));
        RegistrationBuilder buildReg = new RegistrationBuilder();
        Registration registration = buildReg.setDate(LocalDate.of(2002,6, 23)).setRegNumber(7001).setRegOffice("Sreemangal").setLand(lands).setPrice(2000000).setBuyer(buyer).setSeller(seller).builder();
        Assertions.assertNotNull(registration);
        Assertions.assertEquals(7001, registration.getRegNumber());
        Assertions.assertEquals("Sreemangal", registration.getRegOffice());
        Assertions.assertEquals(2000000, registration.getPrice());
        Assertions.assertEquals("Jobbar", registration.getSeller().get(0).name());
    }
}