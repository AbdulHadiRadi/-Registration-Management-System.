package LandRegistrationManagement;
public class LandRegistered{
    RegistrationBuilder buildRegistraion;
    public LandRegistered() {
        this.buildRegistraion =  new Registration.LandRegistration();
    }

    public RegistrationBuilder getBuildRegistraion() {
        return buildRegistraion;
    }
}
