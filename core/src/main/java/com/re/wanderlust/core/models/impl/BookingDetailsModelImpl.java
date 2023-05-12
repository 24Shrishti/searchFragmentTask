package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.beans.CancellationFragmentEntity;
import com.re.wanderlust.core.models.BookingDetailsModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.services.RestServices;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * The class {@code BookingDetailsModelImpl} contain method that
 * fetch the data of rider booking details from api.
 *
 *  @version 1.0
 *  @since 1.0
 */

@Getter
@Model(adaptables = {SlingHttpServletRequest.class},
        adapters = {BookingDetailsModel.class},
        resourceType = {BookingDetailsModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class BookingDetailsModelImpl extends BaseComponentModel
        implements BookingDetailsModel {

    public static final String TOUR = "Tour";
    protected static final String RESOURCE_TYPE = "re-wanderlust/"
            + "components/bookingDetails";

    private static final Logger LOGGER
            = LoggerFactory.getLogger(BookingDetailsModelImpl.class);

    public static final String UNAUTHORIZED =
            "User is Unauthorized , Token Missing ";
    private static final int ORDER_ID_INDEX = 0;
    private static final int BOOKING_ID_INDEX = 1;
    public static final int INT = 3;
    public static final int ZERO = 0;


    private String status = StringUtils.EMPTY;

    @OSGiService
    private RestServices restServices;

    @SlingObject
    private SlingHttpServletRequest request;

    // Basic Tab ------------------------>

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String otpMessage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String maleLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String femaleLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String accomodationLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String viewDetailsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String viewDetailsRedirectionPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingType;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingIdLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourDetailsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String terrainLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String distancePerDayLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startPointLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String endPointLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingDateLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingWithLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalPriceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingSummary;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String rideNumber;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startOTP;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startOTPDescription;

    // Personal detail Tab -------------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String ridingDetailTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String riderDetailTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String pillionDetailTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String genderLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String ageLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String foodPreferenceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String allergiesOrSpecialRequestLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String personalTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String nameLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emailLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String nationalityLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String servicesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emptyServiceMessage;



    // Emergency contact Detail Tab -------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emergencyTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emrNameLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emrMobileLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String relationLabel;

    // View Invoice Tab -------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String viewInvoiceTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceRiderLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String documentViewText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceDownloadAll;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceCloseBtnText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceMadeWith;

    // Edit Mobile Number Tab -------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String editMobileNumberTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String currentMobileNoText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String newMobileNoText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String infoMsg;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String closeBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String confirmBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invalidNumberLabel;

    //Ride And Room Preference Tab------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String roomSharingLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String roomPreferenceForPillionLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String roomPreferenceForRiderLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String ridePreferenceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String rideAndRoomPreferenceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String occupancyLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String asterixSymbolLabel;

    //Actions Tab ----------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String goBackLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String goBackButtonRedirection;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String returnPolicyLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceOpenInNewTab;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String vehicleDocumentLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String yesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String noLabel;

    public String getViewDetailsRedirectionPath() {
        return  request.getResourceResolver().map(viewDetailsRedirectionPath);
    }

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String vehicleDocumentWarningText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancelBookingLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancelBookingRedirectionPath;

    // Icons Tab ----------------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String rupeesIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String arrowIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String phoneEditIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String callingIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String invoiceIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String downloadIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String endIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String terrainIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String distanceIcon;

    @SlingObject
    private Resource currentResource;

    /* for cancellation policy popup */

    private CancellationFragmentEntity contentFragment =
            new CancellationFragmentEntity();

    /**
     * Get authoring fields from content fragment.
     *
     * @return ContentFragmentEntity
     */

    public CancellationFragmentEntity getAuthoringField() {
        if (StringUtils.equals(getWanderlustCategories(), TOUR)) {
            contentFragment = CommonUtils.
                    getContentFragmentAuthoringFields(request, currentResource);
        }
        return contentFragment;
    }

    @Getter
    private String preSuffixName = StringUtils.EMPTY;
    @Getter
    private String bookingDetail = StringUtils.EMPTY;

    // Error Tab --------------------->

    private String token = StringUtils.EMPTY;


    /**
     * return token which is required for authentication.
     * fetching the selector from URL.
     */
    @PostConstruct
    protected void init() {

        preSuffixName = CommonUtils.
                getCookieConfig(currentResource).preSuffixName();
        LOGGER.debug("GET preSuffixName :: {}", preSuffixName);
        List<String> suffix = CommonUtils.getSuffixFromUrl(request);
        LOGGER.debug("GET suffix from url :: {}", suffix);
        if (suffix.size() != 0) {
            status = suffix.get(2);
        }
        Map<String, Object> bookingDetailMap =
                new HashMap<>();
        bookingDetailMap.put("otpMessage", otpMessage);
        bookingDetailMap.put("maleLabel", maleLabel);
        bookingDetailMap.put("femaleLabel", femaleLabel);
        bookingDetailMap.put("relationLabel", relationLabel);
        bookingDetailMap.put("bookingTitle", bookingTitle);
        bookingDetailMap.put("bookingType", bookingType);
        bookingDetailMap.put("bookingIdLabel", bookingIdLabel);
        bookingDetailMap.put("bookingDateLabel", bookingDateLabel);
        bookingDetailMap.put("bookingWithLabel", bookingWithLabel);
        bookingDetailMap.put("totalPriceLabel", totalPriceLabel);
        bookingDetailMap.put("bookingSummary", bookingSummary);
        bookingDetailMap.put("rideNumber", rideNumber);
        bookingDetailMap.put("viewDetailsRedirectionPath",
                viewDetailsRedirectionPath);
        bookingDetailMap.put("startOTP", startOTP);
        bookingDetailMap.put("startOTPDescription", startOTPDescription);
        bookingDetailMap.put("ridingDetailTitle", ridingDetailTitle);
        bookingDetailMap.put("personalTitle", personalTitle);
        bookingDetailMap.put("nameLabel", nameLabel);
        bookingDetailMap.put("emailLabel", emailLabel);
        bookingDetailMap.put("mobileLabel", mobileLabel);
        bookingDetailMap.put("nationalityLabel", nationalityLabel);
        bookingDetailMap.put("servicesLabel", servicesLabel);
        bookingDetailMap.put("genderLabel", genderLabel);
        bookingDetailMap.put("ageLabel", ageLabel);
        bookingDetailMap.put("emptyServiceMessage", emptyServiceMessage);
        bookingDetailMap.put("emergencyTitle", emergencyTitle);
        bookingDetailMap.put("emrMobileLabel", emrMobileLabel);
        bookingDetailMap.put("accomodationLabel", accomodationLabel);
        bookingDetailMap.put("viewDetailsLabel", viewDetailsLabel);
        bookingDetailMap.put("terrainLabel", terrainLabel);
        bookingDetailMap.put("distancePerDayLabel", distancePerDayLabel);
        bookingDetailMap.put("editMobileNumberTitle",
                editMobileNumberTitle);
        bookingDetailMap.put("currentMobileNoText", currentMobileNoText);
        bookingDetailMap.put("startPointLabel", startPointLabel);
        bookingDetailMap.put("allergiesOrSpecialRequestLabel",
                allergiesOrSpecialRequestLabel);
        bookingDetailMap.put("foodPreferenceLabel", foodPreferenceLabel);
        bookingDetailMap.put("pillionDetailTitle", pillionDetailTitle);
        bookingDetailMap.put("endPointLabel", endPointLabel);
        bookingDetailMap.put("newMobileNoText", newMobileNoText);
        bookingDetailMap.put("roomSharingLabel", roomSharingLabel);
        bookingDetailMap.put("riderDetailTitle", riderDetailTitle);
        bookingDetailMap.put("roomPreferenceForPillionLabel",
                roomPreferenceForPillionLabel);
        bookingDetailMap.put("roomPreferenceForRiderLabel",
                roomPreferenceForRiderLabel);
        bookingDetailMap.put("ridePreferenceLabel", ridePreferenceLabel);
        bookingDetailMap.put("occupancyLabel", occupancyLabel);
        bookingDetailMap.put("asterixSymbolLabel", asterixSymbolLabel);
        bookingDetailMap.put("rideAndRoomPreferenceLabel",
                rideAndRoomPreferenceLabel);
        bookingDetailMap.put("infoMsg", infoMsg);
        bookingDetailMap.put("closeBtnLabel", closeBtnLabel);
        bookingDetailMap.put("confirmBtnLabel", confirmBtnLabel);
        bookingDetailMap.put("invalidNumberLabel", invalidNumberLabel);
        bookingDetailMap.put("goBackLabel", goBackLabel);
        bookingDetailMap.put("goBackButtonRedirection",
                goBackButtonRedirection);
        bookingDetailMap.put("returnPolicyLabel", returnPolicyLabel);
        bookingDetailMap.put("invoiceLabel", invoiceLabel);
        bookingDetailMap.put("invoiceOpenInNewTab", invoiceOpenInNewTab);
        bookingDetailMap.put("vehicleDocumentLabel", vehicleDocumentLabel);
        bookingDetailMap.put("cancelBookingLabel", cancelBookingLabel);
        bookingDetailMap.put("cancelBookingRedirectionPath",
                cancelBookingRedirectionPath);
        bookingDetailMap.put("arrowIcon", arrowIcon);
        bookingDetailMap.put("tourDetailsLabel", tourDetailsLabel);
        bookingDetailMap.put("phoneEditIcon", phoneEditIcon);
        bookingDetailMap.put("callingIcon", callingIcon);
        bookingDetailMap.put("invoiceIcon", invoiceIcon);
        bookingDetailMap.put("downloadIcon", downloadIcon);
        bookingDetailMap.put("startIcon", startIcon);
        bookingDetailMap.put("endIcon", endIcon);
        bookingDetailMap.put("terrainIcon", terrainIcon);
        bookingDetailMap.put("distanceIcon", distanceIcon);
        bookingDetailMap.put("rupeesIcon", rupeesIcon);
        bookingDetailMap.put("documentViewText", documentViewText);
        bookingDetailMap.put("viewInvoiceTitle", viewInvoiceTitle);
        bookingDetailMap.put("invoiceRiderLabel", invoiceRiderLabel);
        bookingDetailMap.put("invoiceDownloadAll", invoiceDownloadAll);
        bookingDetailMap.put("invoiceCloseBtnText", invoiceCloseBtnText);
        bookingDetailMap.put("invoiceMadeWith", invoiceMadeWith);
        bookingDetailMap.put("imagePath", super.getImagePath());
        bookingDetailMap.put("openInNewTab", super.getOpenInNewTab());
        bookingDetailMap.put("anchorPath", super.getAnchorPath());
        bookingDetailMap.put("title", super.getTitle());
        bookingDetailMap.put("description", super.getDescription());
        bookingDetailMap.put("imgAltText", super.getImgAltText());

        try {
            bookingDetail = new ObjectMapper()
                    .writeValueAsString(bookingDetailMap);
        } catch (JsonProcessingException e) {
            LOGGER.error("RepositoryException :: {0}", e.getMessage());
        }
    }
}
