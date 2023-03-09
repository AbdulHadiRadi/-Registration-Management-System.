package LandRegistrationManagement;

import java.time.LocalDate;
import java.util.List;

public interface RegistrationBuilder {
    RegistrationBuilder setDate(LocalDate date);

    RegistrationBuilder setRegOffice(String regOffice);

    RegistrationBuilder setRegNumber(int regNumber);

    RegistrationBuilder setPrice(long price);

    RegistrationBuilder setLand(List<Land> land);

    RegistrationBuilder setPersons(List<Person> persons);

    Registration builder();
}
