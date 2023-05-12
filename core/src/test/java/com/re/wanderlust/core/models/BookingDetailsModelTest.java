package com.re.wanderlust.core.models;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.models.impl.BookingDetailsModelImpl;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.re.wanderlust.core.testcontext.AppAemContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class BookingDetailsModelTest {

    public static final String BOOKING_DETAILS_MODEL_JSON = "bookingDetailsModel.json";
    private final AemContext ctx = AppAemContext.newAemContext();

    private BookingDetailsModelImpl bookingDetails = new BookingDetailsModelImpl();

    @BeforeEach
    void setUp(){
        ctx.addModelsForClasses(BookingDetailsModelImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ BOOKING_DETAILS_MODEL_JSON,TestConstants.CONTENT_PATH);
    }
    @Test
    void testRupeesIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/rupee-icon.jpg",bookingDetails.getRupeesIcon());
    }
    @Test
    void negativeTestRupeesIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getRupeesIcon());
    }
    @Test
    void testBookingTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Booking Title",bookingDetails.getBookingTitle());
    }

    @Test
    void negativeTestBookingTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getBookingTitle());
    }
    @Test
    void testCancelBookingLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Cancel booking label",bookingDetails.getCancelBookingLabel());
    }
    @Test
    void negativeTestCancelBookingLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getCancelBookingLabel());
    }
    @Test
    void testBookingType(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Rental",bookingDetails.getBookingType());
    }
    @Test
    void negativeTestBookingType(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getBookingType());
    }
    @Test
    void testBookingSummary(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Booking summary label",bookingDetails.getBookingSummary());
    }
    @Test
    void negativeTestBookingSummary(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getBookingSummary());
    }
    @Test
    void testBookingIdLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("booking Id",bookingDetails.getBookingIdLabel());
    }

    @Test
    void negativeTestBookingIdLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getBookingIdLabel());
    }

    @Test
    void testBookingDateLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Booking date",bookingDetails.getBookingDateLabel());
    }

    @Test
    void negativeTestBookingDateLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getBookingDateLabel());
    }

    @Test
    void testBookingWithLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("booking with",bookingDetails.getBookingWithLabel());
    }

    @Test
    void negativeTestBookingWithLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getBookingWithLabel());
    }

    @Test
    void testTotalPriceLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Total price label",bookingDetails.getTotalPriceLabel());
    }

    @Test
    void negativeTestTotalPriceLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getTotalPriceLabel());
    }
    @Test
    void testRideNumber(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Ride number label",bookingDetails.getRideNumber());
    }
    @Test
    void negativeTestRideNumber(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getRideNumber());
    }
    @Test
    void testGoBackLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Go back button",bookingDetails.getGoBackLabel());
    }
    @Test
    void negativeTestGoBackLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getGoBackLabel());
    }
    @Test
    void testVehicleDocumentLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Vehicle document",bookingDetails.getVehicleDocumentLabel());
    }
    @Test
    void negativeTestVehicleDocumentLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getVehicleDocumentLabel());
    }
    @Test
    void testRidingDetailTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Riding details title",bookingDetails.getRidingDetailTitle());
    }
    @Test
    void negativeTestRidingDetailTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getRidingDetailTitle());
    }
    @Test
    void testPersonalTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Personal detail",bookingDetails.getPersonalTitle());
    }

    @Test
    void negativeTestPersonalTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getPersonalTitle());
    }
    @Test
    void testOtpMessage(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("9810",bookingDetails.getOtpMessage());
    }
    @Test
    void negativeTestOtpMessage(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getOtpMessage());
    }

    @Test
    void testServicesLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("No value added services",bookingDetails.getServicesLabel());
    }

    @Test
    void negativeTestServicesLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getServicesLabel());
    }
    @Test
    void testArrowIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/arrow-icon.jpg",bookingDetails.getArrowIcon());
    }
    @Test
    void negativeTestArrowIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getArrowIcon());
    }

    @Test
    void testNameLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Name",bookingDetails.getNameLabel());
    }

    @Test
    void negativeTestNameLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getNameLabel());
    }

    @Test
    void testEmailLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("samplemail@mail.com",bookingDetails.getEmailLabel());
    }

    @Test
    void negativeTestEmailLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getNameLabel());
    }
    @Test
    void testStartOTP(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("1245",bookingDetails.getStartOTP());
    }
    @Test
    void negativeTestStartOTP(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getStartOTP());
    }
    @Test
    void testEmptyServiceMessage(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Empty services message",bookingDetails.getEmptyServiceMessage());
    }
    @Test
    void negativeTestEmptyServiceMessage(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getEmptyServiceMessage());
    }
//    @Test
//    void testNotFound(){
//        bookingDetails = getModel("/content/bookingDetails");
//        assertEquals("400error block",bookingDetails.getNotFound());
//    }
//    @Test
//    void negativeTestNotFound(){
//        bookingDetails = getModel("/content/bookingDetails");
//        assertNotEquals("",bookingDetails.getNotFound());
//    }



    @Test
    void testMobileLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("9810955533",bookingDetails.getMobileLabel());
    }

    @Test
    void negativeTestMobileLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getMobileLabel());
    }

    @Test
    void testNationalityLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Indian",bookingDetails.getNationalityLabel());
    }

    @Test
    void negativeTestNationalityLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getNationalityLabel());
    }


    @Test
    void testEmergencyTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Emergency Details Title",bookingDetails.getEmergencyTitle());
    }

    @Test
    void negativeTestEmergencyTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getEmergencyTitle());
    }

    @Test
    void testEmrNameLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Name",bookingDetails.getEmrNameLabel());
    }

    @Test
    void negativeTestEmrNameLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getEmrNameLabel());
    }
    @Test
    void testCallingIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/calling-icon.jpg",bookingDetails.getCallingIcon());
    }
    @Test
    void negativeTestCallingIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getCallingIcon());
    }

    @Test
    void testEmrMobileLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("9810955533",bookingDetails.getEmrMobileLabel());
    }

    @Test
    void negativeTestEmrMobileLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getEmrMobileLabel());
    }
    @Test
    void testDownloadIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/download-icon.jpg",bookingDetails.getDownloadIcon());
    }
    @Test
    void negativeTestDownloadIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getDownloadIcon());
    }
    @Test
    void testReturnPolicyLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Return Policy",bookingDetails.getReturnPolicyLabel());
    }
    @Test
    void negativeTestReturnPolicyLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getReturnPolicyLabel());
    }

    @Test
    void testInvoiceLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("view invoice",bookingDetails.getInvoiceLabel());
    }

    @Test
    void negativeTestInvoiceLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getInvoiceLabel());
    }
    @Test
    void testInvoiceIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/invoice-icon.jpg",bookingDetails.getInvoiceIcon());
    }
    @Test
    void negativeTestInvoiceIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/invoice-icon.jpg",bookingDetails.getInvoiceIcon());
    }
//    @Test
//    void testServerError(){
//        bookingDetails = getModel("/content/bookingDetails");
//        assertEquals("500error block",bookingDetails.getServerError());
//    }
//    @Test
//    void negativeTestServerError(){
//        bookingDetails = getModel("/content/bookingDetails");
//        assertNotEquals("",bookingDetails.getServerError());
//    }
    @Test
    void testCancelBookingRedirectionPath(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/re-wanderlust/us/en",bookingDetails.getCancelBookingRedirectionPath());
    }
    @Test
    void negativeTestCancelBookingRedirectionPath(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getCancelBookingRedirectionPath());
    }
    @Test
    void testPhoneEditIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("/content/dam/re-wanderlust/phone-icon.jpg",bookingDetails.getPhoneEditIcon());
    }
    @Test
    void negativeTestPhoneEditIcon(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getPhoneEditIcon());
    }
//    @Test
//    void testBadRequest(){
//        bookingDetails = getModel("/content/bookingDetails");
//        assertEquals("400error block",bookingDetails.getBadRequest());
//    }
//    @Test
//    void negativeTestBadRequest(){
//        bookingDetails = getModel("/content/bookingDetails");
//        assertNotEquals("",bookingDetails.getBadRequest());
//    }

    @Test
    void testEditMobileNumberTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Edit Mobile Number",bookingDetails.getEditMobileNumberTitle());
    }
    @Test
    void negativeTestEditMobileNumberTitle(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getEditMobileNumberTitle());
    }

    @Test
    void testCurrentMobileNoText(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Current Mobile No",bookingDetails.getCurrentMobileNoText());
    }
    @Test
    void negativeTestCurrentMobileNoText(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getCurrentMobileNoText());
    }

    @Test
    void testNewMobileNoText(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("New Mobile No",bookingDetails.getNewMobileNoText());
    }
    @Test
    void negativeTestNewMobileNoText(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getNewMobileNoText());
    }

    @Test
    void testInfoMsg(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Information Message",bookingDetails.getInfoMsg());
    }
    @Test
    void negativeTestInfoMsg(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getInfoMsg());
    }

    @Test
    void testCloseBtnLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Close",bookingDetails.getCloseBtnLabel());
    }
    @Test
    void negativeTestCloseBtnLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getCloseBtnLabel());
    }

    @Test
    void testConfirmBtnLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Confirm",bookingDetails.getConfirmBtnLabel());
    }
    @Test
    void negativeTestConfirmBtnLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getConfirmBtnLabel());
    }

    @Test
    void testInvalidNumberLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertEquals("Invalid Number",bookingDetails.getInvalidNumberLabel());
    }
    @Test
    void negativeTestInvalidNumberLabel(){
        bookingDetails = getModel("/content/bookingDetails");
        assertNotEquals("",bookingDetails.getInvalidNumberLabel());
    }

    private BookingDetailsModelImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(BookingDetailsModelImpl.class);
    }
}
