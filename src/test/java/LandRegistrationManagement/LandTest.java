package LandRegistrationManagement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LandTest {
    private Survey survey;
    private Land land;

    @BeforeEach
    public void setUp(){
        survey = new Survey(1201, 980);
        land = new Land("Ruposhpur", 5, survey);
    }
    @AfterEach
    public void tearDOwn(){
        survey = null;
        land = null;
    }
    @Test
    void testLandConstructor(){
        Assertions.assertNotNull(land);
    }
    @Test
    void testGetArea() {
        Assertions.assertEquals("Ruposhpur", land.getArea());
        Assertions.assertNotEquals("Rupo", land.getArea());
    }
    @Test
    void testGetAmount() {
        Assertions.assertEquals(5, land.getAmount());
        Assertions.assertNotEquals(3, land.getAmount());
    }
    @Test
    void testGetRsSurvey() {
        Assertions.assertEquals(survey, land.getRsSurvey());
        Assertions.assertNotEquals(null, land.getRsSurvey());
    }
}