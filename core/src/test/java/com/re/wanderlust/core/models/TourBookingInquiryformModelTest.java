package com.re.wanderlust.core.models;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.models.impl.TourBookingInquiryformModelImpl;
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
public class TourBookingInquiryformModelTest {

    public static final String TOUR_ENQUIRY_MODEL_JSON = "tourEnquiryModel.json";
    private final AemContext ctx = AppAemContext.newAemContext();

    private TourBookingInquiryformModelImpl tourBookingInquiryFormModel;

    @BeforeEach
    void setUp(){
        ctx.addModelsForClasses(TourBookingInquiryformModelImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ TOUR_ENQUIRY_MODEL_JSON,TestConstants.CONTENT_PATH);
    }

    @Test
    void testTitle(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enquiry form",tourBookingInquiryFormModel.getTitle());
    }

    @Test
    void negativeTestTitle(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getTitle());
    }

    @Test
    void testPreferredDate(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter preffered date",tourBookingInquiryFormModel.getPreferredDate());
    }

    @Test
    void negativeTestPreferredDate(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getPreferredDate());
    }

    @Test
    void testNameLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Name",tourBookingInquiryFormModel.getNameLabel());
    }

    @Test
    void negativeTestNameLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNameLabel());
    }

    @Test
    void testEmailLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Email Id",tourBookingInquiryFormModel.getEmailLabel());
    }

    @Test
    void negativeTestEmailLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getEmailLabel());
    }

    @Test
    void testMobileNumberLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Mobile Number",tourBookingInquiryFormModel.getMobileNumberLabel());
    }

    @Test
    void negativeTestMobileNumberLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getMobileNumberLabel());
    }

    @Test
    void testCountryCode(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("3",tourBookingInquiryFormModel.getCountryCode());
    }

    @Test
    void negativeTestCountryCode(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getCountryCode());
    }

    @Test
    void testNationalityLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Nationality",tourBookingInquiryFormModel.getNationalityLabel());
    }

    @Test
    void negativeTestNationalityLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNationalityLabel());
    }

    @Test
    void testNoOfRiderLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Total Riders",tourBookingInquiryFormModel.getNoOfRiderLabel());
    }

    @Test
    void negativeTestNoOfRiderLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNoOfRiderLabel());
    }

    @Test
    void testNoOfRidesLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("total Rides",tourBookingInquiryFormModel.getNoOfRidesLabel());
    }

    @Test
    void negativeTestNoOfRidesLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNoOfRidesLabel());
    }

    @Test
    void testSubmitButtonLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Submit button",tourBookingInquiryFormModel.getSubmitButtonLabel());
    }

    @Test
    void negativeTestSubmitButtonLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getSubmitButtonLabel());
    }

    @Test
    void testSubmitButton(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("/content/re-wanderlust/us/en/comparepage",tourBookingInquiryFormModel.getSubmitButton());
    }

    @Test
    void negativeTestSubmitButton(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getSubmitButton());
    }

    @Test
    void testSubmitButtonIcon(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("/content/dam/re-wanderlust/call_icon.png",tourBookingInquiryFormModel.getSubmitButtonIcon());
    }

    @Test
    void negativeTestSubmitButtonIcon(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getSubmitButtonIcon());
    }

    @Test
    void testLimitRides(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("5",tourBookingInquiryFormModel.getLimitRides());
    }

    @Test
    void negativeTestLimitRides(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getLimitRides());
    }

    @Test
    void testLimitRiders(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("5",tourBookingInquiryFormModel.getLimitRiders());
    }

    @Test
    void negativeTestLimitRiders(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getLimitRiders());
    }

    @Test
    void testDescription(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter Description",tourBookingInquiryFormModel.getDescription());
    }

    @Test
    void negativeTestDescription(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getDescription());
    }

    @Test
    void testNameErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter your name",tourBookingInquiryFormModel.getNameErrorLabel());
    }

    @Test
    void negativeTestNameErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNameErrorLabel());
    }

    @Test
    void testNameRegexError(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("correct name enter",tourBookingInquiryFormModel.getNameRegexError());
    }

    @Test
    void negativeTestNameRegexError(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNameRegexError());
    }

    @Test
    void testEmailIdErrorRegex(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Enter correct email adress",tourBookingInquiryFormModel.getEmailIdErrorRegex());
    }

    @Test
    void negativeTestEmailIdErrorRegex(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getEmailIdErrorRegex());
    }

    @Test
    void testEmailIdErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("plz enter email",tourBookingInquiryFormModel.getEmailIdErrorLabel());
    }

    @Test
    void negativeTestEmailIdErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getEmailIdErrorLabel());
    }

    @Test
    void testMobileNumberErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("mobile enter",tourBookingInquiryFormModel.getMobileNumberErrorLabel());
    }

    @Test
    void negativeTestMobileNumberErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getMobileNumberErrorLabel());
    }

    @Test
    void testMobileRegexNumberError(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("correct mobile no. enter",tourBookingInquiryFormModel.getMobileRegexNumberError());
    }

    @Test
    void negativeTestMobileRegexNumberError(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getMobileRegexNumberError());
    }

    @Test
    void testSelectCountryErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("nationality select",tourBookingInquiryFormModel.getSelectCountryErrorLabel());
    }

    @Test
    void negativeTestSelectCountryErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getSelectCountryErrorLabel());
    }

    @Test
    void testNoOfRidersErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter riders",tourBookingInquiryFormModel.getNoOfRidersErrorLabel());
    }

    @Test
    void negativeTestNoOfRidersErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNoOfRidersErrorLabel());
    }

    @Test
    void testNoOfRidesErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter rides",tourBookingInquiryFormModel.getNoOfRidesErrorLabel());
    }

    @Test
    void negativeTestNoOfRidesErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNoOfRidesErrorLabel());
    }

    @Test
    void testDescriptionError(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter a valid description",tourBookingInquiryFormModel.getDescriptionError());
    }

    @Test
    void negativeTestDescriptionError(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getDescriptionError());
    }

    @Test
    void testMaxRidersErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Maximum limit reached",tourBookingInquiryFormModel.getMaxRidersErrorLabel());
    }

    @Test
    void negativeTestMaxRidersErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getMaxRidersErrorLabel());
    }

    @Test
    void testMaxRidesErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Maximum limit reached for rides",tourBookingInquiryFormModel.getMaxRidesErrorLabel());
    }

    @Test
    void negativeTestMaxRidesErrorLabel(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getMaxRidesErrorLabel());
    }

    @Test
    void testNamePlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Enter your name",tourBookingInquiryFormModel.getNamePlaceholder());
    }

    @Test
    void negativeTestNamePlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNamePlaceholder());
    }

    @Test
    void testEmailIdPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("enter your email id",tourBookingInquiryFormModel.getEmailIdPlaceholder());
    }

    @Test
    void negativeTestEmailIdPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getEmailIdPlaceholder());
    }

    @Test
    void testMobileNumberPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Enter your Mobile Number",tourBookingInquiryFormModel.getMobileNumberPlaceholder());
    }

    @Test
    void negativeTestMobileNumberPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getMobileNumberPlaceholder());
    }

    @Test
    void testSelectCountryPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Nationality",tourBookingInquiryFormModel.getSelectCountryPlaceholder());
    }

    @Test
    void negativeTestSelectCountryPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getSelectCountryPlaceholder());
    }

    @Test
    void testNoOfRidersPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Enter Numbers of Rides",tourBookingInquiryFormModel.getNoOfRidersPlaceholder());
    }

    @Test
    void negativeTestNoOfRidersPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNoOfRidersPlaceholder());
    }

    @Test
    void testNoOfRidesPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Enter Total rides",tourBookingInquiryFormModel.getNoOfRidesPlaceholder());
    }

    @Test
    void negativeTestNoOfRidesPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getNoOfRidesPlaceholder());
    }

    @Test
    void testDescriptionPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertEquals("Description here",tourBookingInquiryFormModel.getDescriptionPlaceholder());
    }

    @Test
    void negativeTestDescriptionPlaceholder(){
        tourBookingInquiryFormModel = getModel("/content/tourEnquiry");
        assertNotEquals("",tourBookingInquiryFormModel.getDescriptionPlaceholder());
    }


    private TourBookingInquiryformModelImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(TourBookingInquiryformModelImpl.class);
    }
}
