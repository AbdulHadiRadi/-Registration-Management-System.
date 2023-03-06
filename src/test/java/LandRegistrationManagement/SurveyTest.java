package LandRegistrationManagement;
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
        Assertions.assertEquals(7001, survey.surveyNumber());
        Assertions.assertNotEquals(4501, survey.surveyNumber());
    }

    @Test
    void testGetPoint() {
        Assertions.assertEquals(999, survey.point());
        Assertions.assertNotEquals(4501, survey.point());
    }

}