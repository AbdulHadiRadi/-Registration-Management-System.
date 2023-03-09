package LandRegistrationManagement;

import java.time.LocalDate;
import java.util.List;

public class Registration {
    private final LocalDate date;
    private final String regOffice;
    private final int regNumber;
    private final long price;
    private final List<Land> land;
    private final List<Person> persons;

    private Registration(LandRegistration registration) {
        this.date = registration.date;
        this.regOffice = registration.regOffice;
        this.regNumber = registration.regNumber;
        this.price = registration.price;
        this.land = registration.land;
        this.persons = registration.persons;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getRegOffice() {
        return this.regOffice;
    }

    public int getRegNumber() {
        return this.regNumber;
    }

    public long getPrice() {
        return this.price;
    }
    public List<Person> getPersons() {
        return this.persons;
    }
    public List<Land> getLand() {
        return this.land;
    }



    public static class LandRegistration implements RegistrationBuilder{
        private LocalDate date;
        private String regOffice;
        private int regNumber;
        private long price;
        private List<Land> land;
        private List<Person> persons;

        public LandRegistration() {
        }

        public LandRegistration setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public LandRegistration setRegOffice(String regOffice) {
            this.regOffice = regOffice;
            return this;
        }

        public LandRegistration setRegNumber(int regNumber) {
            this.regNumber = regNumber;
            return this;
        }

        public LandRegistration setPrice(long price) {
            this.price = price;
            return this;
        }

        public LandRegistration setLand(List<Land> land) {
            this.land = land;
            return this;
        }

        public LandRegistration setPersons(List<Person> persons) {
            this.persons = persons;
            return this;
        }
        public Registration builder(){
            return new Registration(this);
        }
    }
}
