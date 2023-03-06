package LandRegistrationManagement;

import java.time.LocalDate;
import java.util.LinkedList;

public interface RegistrationBuilder {
    RegistrationBuilder setDate(LocalDate date);

    RegistrationBuilder setRegOffice(String regOffice);

    RegistrationBuilder setRegNumber(int regNumber);

    RegistrationBuilder setPrice(long price);

    RegistrationBuilder setLand(LinkedList<Land> land);

    RegistrationBuilder setPersons(LinkedList<Person> persons);

    Registration builder();
}
