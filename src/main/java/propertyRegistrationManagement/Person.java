package propertyRegistrationManagement;

public class Person{
    private final String status;
    private final String name;
    private final long nid;

    public Person(String status, String name, long nid) {
        this.status = status;
        this.name = name;
        this.nid = nid;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public long getNid() {
        return nid;
    }
}
