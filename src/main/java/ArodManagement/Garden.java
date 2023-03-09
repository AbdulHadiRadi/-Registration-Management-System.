package ArodManagement;

import LandRegistrationManagement.Person;

import java.util.LinkedList;
import java.util.List;

public class Garden {
    private final String name;
    private final List<Person> owners;

    public Garden(String name, LinkedList<Person> owners) {
        this.name = name;
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public List<Person> getOwners() {
        return owners;
    }
}
