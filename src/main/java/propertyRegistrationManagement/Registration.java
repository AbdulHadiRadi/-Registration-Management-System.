package propertyRegistrationManagement;

import java.time.LocalDate;
import java.util.LinkedList;

public class Registration {
    private LocalDate date;
    private String regOffice;
    private int regNumber;
    private long price;
    private LinkedList<Land> land;
    private LinkedList<Person> persons;

    public LocalDate getDate() {
        return date;
    }

    public String getRegOffice() {
        return regOffice;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public long getPrice() {
        return price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setRegOffice(String regOffice) {
        this.regOffice = regOffice;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public LinkedList<Land> getLand() {
        return land;
    }

    public void setLand(LinkedList<Land> land) {
        this.land = land;
    }

    public LinkedList<Person> getPersons() {
        return persons;
    }

    public void setPersons(LinkedList<Person> persons) {
        this.persons = persons;
    }

}
