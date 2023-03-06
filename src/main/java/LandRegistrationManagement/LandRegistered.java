package LandRegistrationManagement;
public class LandRegistered{
    private final RegistrationBuilder buildRegistraion;
    public LandRegistered() {
        this.buildRegistraion =  new Registration.LandRegistration();
    }

    public RegistrationBuilder getBuildRegistraion() {
        return buildRegistraion;
    }
}
