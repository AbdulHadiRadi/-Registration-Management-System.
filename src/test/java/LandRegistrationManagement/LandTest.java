package LandRegistrationManagement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LandTest {
    Land  emptyLand = null;
    Survey survey = new Survey(1201, 980);
    Land land = new Land("Ruposhpur", 5, survey);
    @Test
    public void testSurveyConstructor(){
        Assertions.assertNotNull(survey);
    }
    @Test
    public void testLandConstructor(){
        Assertions.assertNull(emptyLand);
        Assertions.assertNotNull(land);
    }
    @Test
    public void testGetArea() {
        Assertions.assertEquals("Ruposhpur", land.getArea());
        Assertions.assertNotEquals("Rupo", land.getArea());
    }
    @Test
    public void testGetAmount() {
        Assertions.assertEquals(5, land.getAmount());
        Assertions.assertNotEquals(3, land.getAmount());
    }
    @Test
    void testGetRsSurvey() {
        Assertions.assertEquals(1201, land.getRsSurvey().surveyNumber());
        Assertions.assertEquals(980, land.getRsSurvey().point());
    }
}