package propertyRegistrationManagement;

import java.time.LocalDate;
import java.util.LinkedList;

public class RegistrationBuilder {
    private final Registration registration = new Registration();
    public RegistrationBuilder setDate(LocalDate date) {
        registration.setDate(date);
        return this;
    }

    public RegistrationBuilder setRegOffice(String regOffice) {
        registration.setRegOffice(regOffice);
        return this;
    }

    public RegistrationBuilder setRegNumber(int regNumber) {
        registration.setRegNumber(regNumber);
        return this;
    }

    public RegistrationBuilder setPrice(int price) {
        registration.setPrice(price);
        return this;
    }

    public RegistrationBuilder setLand(LinkedList<Land> land) {
        registration.setLand(land);
        return this;
    }

    public RegistrationBuilder setPersons(LinkedList<Person> persons) {
        registration.setPersons(persons);
        return this;
    }

    public Registration builder(){
        return registration;
    }
}
