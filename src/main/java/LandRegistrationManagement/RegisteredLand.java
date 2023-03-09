package LandRegistrationManagement;
public class RegisteredLand {
    private final RegistrationBuilder buildRegistraion;
    public RegisteredLand() {
        this.buildRegistraion =  new Registration.LandRegistration();
    }

    public RegistrationBuilder getBuildRegistraion() {
        return buildRegistraion;
    }
}
