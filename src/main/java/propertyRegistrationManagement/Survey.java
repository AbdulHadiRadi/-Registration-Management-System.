package propertyRegistrationManagement;
// RS and SA Khatian porsa
public class Survey {
    private final int surveyNumber;
    private final int point;
    public Survey(int surveyNumber, int point){
        this.surveyNumber = surveyNumber;
        this.point = point;
    }

    public int getSurveyNumber() {
        return surveyNumber;
    }

    public int getPoint() {
        return point;
    }
}
