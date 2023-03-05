package propertyRegistrationManagement;

public abstract class Person {
    private String name;
    private long nid;

    public Person(String name, long nid) {
        this.name = name;
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public long getNid() {
        return nid;
    }
}
