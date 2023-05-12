package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.OperatorRentalFormModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.models.internals.OperatorRentalFormEntity;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {OperatorRentalFormModel.class},
        resourceType = {OperatorRentalFormModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class OperatorRentalFormModelImpl extends BaseComponentModel
        implements OperatorRentalFormModel {

    static final String RESOURCE_TYPE
            = "re-wanderlust/components/operatorRentalForm";

    private static final Logger LOGGER = LoggerFactory
            .getLogger(OperatorRentalFormModelImpl.class);

    private Map<String, String> operatorRentalFormEntityMap
            = new LinkedHashMap<>();

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String opBusinessNameLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String opBusinessNamePlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorNameLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorNamePlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileNumberLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileNumberPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileNumberVerifyBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileNumberVerifyOtpLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forMobileOtpPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forMobileOtpResendBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forMobileOtpResendLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emailIdLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emailIdPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emailIdVerifyBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String emailIdVerifyOtpLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forMailOtpPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forMailOtpResendBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forMailOtpResendLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String gstNumberLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String gstNumberRadioBtnYesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String gstNumberRadioBtnNoLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String commercialLicenseLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String commercialLicenseRadioBtnYesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String commercialLicenseRadioBtnNoLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String turnoverLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String turnoverBracketLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String addressHeading;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String addressLabel1;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String addressLabel1Placeholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String addressLabel2;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String addressLabel2Placeholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forSelectTurnoverPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String countryLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String countrySelect;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String countrySelectValue1;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String postCodeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String turnoverValidation;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String postCodePlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String stateLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cityLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String urlHeading;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String googleUrlLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String googleUrlPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String websiteUrlLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String websiteUrlPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String twitterUrlLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String twitterUrlPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String instragramUrlLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String instragramUrlPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String serviceProvideLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourRadioButtonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String rentalRadioButtonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String businessDescriptionLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String businessDescriptionPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String disclaimerDescription;


    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String policyLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String submitBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String path;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String facebookUrlLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String facebookUrlPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String opBusinessNameError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorNameError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileNumberError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileNumberOtpError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mailIdError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mailIdOtpError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String address1Error;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String address2Error;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String errorMsgPinCode;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String googleMapUrlError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String websiteUrlError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String facebookUrlError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String instragramUrlError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String twitterUrlError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String alertMsgMobileNumber;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String alertMsgMail;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String alertMsgOtpMobile;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String alertMsgOtpMail;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String alertMsgIncorrectOtp;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String verfiedMobileLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String verfiedMailLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String verifiedMobileIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String altTextForMobile;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String verifiedMailIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String altTextForMail;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forSuccessIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forFailureIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String businessDescriptionLimit;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String descriptionError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String badRequest;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String notFound;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String serverError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String popUpTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String popUpDescription;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String closeBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String errorMsgCountry;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String formValidationFirstDiv;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String formValidationSecondDiv;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String forDetailIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tncPopUp;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String closeBtnForPopUp;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String submitBtnError;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String closeSubmitBtnError;

    @ChildResource
    private Resource dropdownItems;

    @PostConstruct
    protected void init() {
        if (dropdownItems != null
            && dropdownItems.hasChildren()) {

            for (Resource resource
                    :dropdownItems.getChildren()) {

                OperatorRentalFormEntity operatorRentalFormEntity
                        = resource.adaptTo(OperatorRentalFormEntity.class);

                operatorRentalFormEntityMap.put(
                        operatorRentalFormEntity.getValue(),
                        operatorRentalFormEntity.getText());
            }
            LOGGER.debug("return operatorRentalFormEntityMap :: {}",
                    operatorRentalFormEntityMap);
        }
    }

}
