package LandRegistrationManagement;
public class Land {
    private final String area;
    private final double amount;
    private final Survey survey;
    public Land(String area, double amount, Survey survey) {
        this.area = area;
        this.amount = amount;
        this.survey = survey;
    }
    public String getArea() {
        return area;
    }
    public double getAmount() {
        return amount;
    }
    public Survey getRsSurvey() {
        return survey;
    }

}
