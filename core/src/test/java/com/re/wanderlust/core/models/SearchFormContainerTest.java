package com.re.wanderlust.core.models;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.models.impl.SearchFormContainerImpl;
import com.re.wanderlust.core.testcontext.AppAemContext;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
public class SearchFormContainerTest {
    public static final String SEARCH_FORM_CONTAINER_JSON = "searchFormContainer.json";
    private final AemContext ctx = AppAemContext.newAemContext();

    private SearchFormContainerImpl searchFormContainer;

    @BeforeEach
    void setUp(){
        ctx.addModelsForClasses(SearchFormContainerImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ SEARCH_FORM_CONTAINER_JSON,TestConstants.CONTENT_PATH);
    }

    @Test
    void testMobileImage(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("/content/dam/re-wanderlust/royal-enfield-bikes/Group 1333.png",searchFormContainer.getMobileImage());
    }

    @Test
    void negativeTestMobileImage(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getMobileImage());
    }

    @Test
    void testDesktopImage(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("/content/dam/re-wanderlust/royal-enfield-bikes/Group 13339.png",searchFormContainer.getDesktopImage());
    }

    @Test
    void negativeTestDesktopImage(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getDesktopImage());
    }

    @Test
    void testCheckbox(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("true",searchFormContainer.getCheckbox());
    }

    @Test
    void negativeTestCheckbox(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getCheckbox());
    }

    @Test
    void testContainerLink(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("/content/re-wanderlust/us/en",searchFormContainer.getLink());
    }

    @Test
    void negativeTestContainerLink(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getLink());
    }


    @Test
    void testArrowIcon(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("/content/dam/re-wanderlust/arrow-icon.png",searchFormContainer.getArrowIcon());
    }

    @Test
    void negativeTestArrowIcon(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getArrowIcon());
    }

    @Test
    void testCalenderIcon(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("/content/dam/re-wanderlust/calender-icon.png",searchFormContainer.getCalenderIcon());
    }

    @Test
    void negativeTestCalenderIcon(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getCalenderIcon());
    }

    @Test
    void testEndDate(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("13/07/22",searchFormContainer.getEndDate());
    }

    @Test
    void negativeTestEndDate(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getEndDate());
    }

    @Test
    void testAltText(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("searching",searchFormContainer.getAltText());
    }

    @Test
    void negativeTestAltText(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getAltText());
    }

    @Test
    void testNoOfRides(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("1",searchFormContainer.getNoOfRides());
    }

    @Test
    void negativeTestNoOfRides(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getNoOfRides());
    }

    @Test
    void testDescription(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Description",searchFormContainer.getDescription());
    }

    @Test
    void negativeTestDescription(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getDescription());
    }

    @Test
    void testTitle(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("title",searchFormContainer.getTitle());
    }

    @Test
    void negativeTestTitle(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getTitle());
    }

    @Test
    void testStartDate(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("12/07/22",searchFormContainer.getStartDate());
    }

    @Test
    void negativeTestStartDate(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getStartDate());
    }

    @Test
    void testStartPoint(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Faridabad",searchFormContainer.getStartPoint());
    }

    @Test
    void negativeTestStartPoint(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getStartPoint());
    }

    @Test
    void testLink(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("/content/re-wanderlust/us/en",searchFormContainer.getLink());
    }

    @Test
    void negativeTestLink(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getLink());
    }

    @Test
    void testStartLabel(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Start",searchFormContainer.getStartLabel());
    }

    @Test
    void negativeTestStartLabel(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getStartLabel());
    }

    @Test
    void testExploreButtonLabel(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Explore",searchFormContainer.getExploreButtonLabel());
    }

    @Test
    void negativeTestExploreButtonLabel(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getExploreButtonLabel());
    }

    @Test
    void testCalenderPlaceholder(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("CalenderPlaceholder",searchFormContainer.getCalenderPlaceholder());
    }

    @Test
    void negativeTestCalenderPlaceholder(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getCalenderPlaceholder());
    }

    @Test
    void testCalenderTitle(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Calender Title",searchFormContainer.getCalenderTitle());
    }

    @Test
    void negativeTestCalenderTitle(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getCalenderTitle());
    }

    @Test
    void testNoRidesLabel(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("NoRides_Label",searchFormContainer.getNoRidesLabel());
    }

    @Test
    void negativeTestNoRidesLabel(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getNoRidesLabel());
    }

    @Test
    void testPickUpTime(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("PickUp_Time",searchFormContainer.getPickUpTime());
    }

    @Test
    void negativeTestPickUpTime(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getPickUpTime());
    }

    @Test
    void testDropOffTime(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("DropOff_Time",searchFormContainer.getDropOffTime());
    }

    @Test
    void negativeTestDropOffTime(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getDropOffTime());
    }

    @Test
    void testContinueBtn(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Continue_Btn",searchFormContainer.getContinueBtn());
    }

    @Test
    void negativeTestContinueBtn(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getContinueBtn());
    }

    @Test
    void testRedirectionPath(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertEquals("Redirection_Path",searchFormContainer.getRedirectionPath());
    }

    @Test
    void negativeTestRedirectionPath(){
        searchFormContainer = getModel("/content/searchFormContainer");
        assertNotEquals("",searchFormContainer.getRedirectionPath());
    }
    private SearchFormContainerImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(SearchFormContainerImpl.class);
    }
}
