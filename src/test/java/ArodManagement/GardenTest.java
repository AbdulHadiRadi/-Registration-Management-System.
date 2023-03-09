package ArodManagement;

import LandRegistrationManagement.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;


class GardenTest {

    private Garden garden;
    private Person owner;
    LinkedList<Person> owners;
    @BeforeEach
    void setUp() {
        owner = new Person("Owner", "Malek", 460875);
        owners = new LinkedList<Person>();
        owners.add(owner);
        garden = new Garden("Puran", owners);
    }

    @AfterEach
    void tearDown() {
        owner = null;
        owners.clear();
        garden = null;
    }

    @Test
    void getName() {
        Assertions.assertEquals("Puran", garden.getName());
        Assertions.assertNotEquals("Notun", garden.getName());
    }

    @Test
    void getOwners() {
        Assertions.assertEquals(owner, garden.getOwners().get(0));
        Assertions.assertNotEquals(null, garden.getOwners().get(0));
    }
}