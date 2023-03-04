package propertyRegistrationManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SurveyTest {
    Survey survey = new Survey(7001,999);

    @Test
    public void testSurveyConstructor(){
        Assertions.assertNotNull(survey);
    }
    @Test
    void testGetSurveyNumber() {
        Assertions.assertEquals(7001, survey.getSurveyNumber());
        Assertions.assertNotEquals(4501, survey.getSurveyNumber());
    }

    @Test
    void testGetPoint() {
        Assertions.assertEquals(999, survey.getPoint());
        Assertions.assertNotEquals(4501, survey.getPoint());
    }
}