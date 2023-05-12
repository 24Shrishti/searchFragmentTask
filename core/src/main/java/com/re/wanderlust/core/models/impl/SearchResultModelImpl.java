package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.beans.SearchResultEntity;

import com.re.wanderlust.core.models.SearchResultModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.models.internals.LocationsModel;
import com.re.wanderlust.core.services.SearchResult;


import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.List;


/**
 *  Represents a Search Result Model Impl.
 *  used for <b>re-wanderlust</b> project implementation
 *
 *  @version 1.0
 *  @since 1.0
 */
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {SearchResultModel.class},
        resourceType = {SearchFormContainerImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class SearchResultModelImpl extends BaseComponentModel
        implements SearchResultModel {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(SearchResultModel.class);

    public static final String RESOURCE_TYPE =
            "re-wanderlust/components/searchResultsComponent";

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String showLocationsManually;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideSortOptions;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String locationApi;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalRidesAvailableLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String sortByLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String quickViewBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String perDayChargesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String limit;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalDayChargesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String recommendedBikeLimit;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String checkDistanceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String customizationsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modelAgeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modelYearsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String approxKmLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String travelPermitLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String addToCartBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cartAddedBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectModelLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectLocationLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectKMRangeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectAgeStartWith;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectAgeEndWith;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectPriceStartWith;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectPriceEndWith;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectKMRangeEndWith;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectKMRangeStartWith;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectAgeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectPriceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectPartnersLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String filterLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String applyFiltersLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String resetFiltersLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String starIconImagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modalTriggerIconImagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String permitIconImagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String ageIconImagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String approximateKmIconPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String verifiedOperatorLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String rsaAvailableLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String pickUpDropAvailableLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorLocationsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modifyBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String checkDistanceOkayBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String exploreBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeFieldPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String ridersCountPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String entryPointPlaceholder;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String limitForRecommendedBikes;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String recommendedBikesTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String checkDistanceBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationPolicyLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationPolicyDesc;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationPolicyBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String closeBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lateReturnsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String zeroToTwoHoursLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String twoToFourHoursLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String moreThenFourHoursLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String betweenLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String eightDaysLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String threeToSevenDaysLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String threeDaysLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeFrameLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationAmountLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingAmountLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String existingCartLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalDistanceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectDateAndTimeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String dropOfTimeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String pickUpTimeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String continueButtonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startPointValidationMsg;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startDateValidationMsg;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String recommendedRidesForYouTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String sortOptionsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cartAddedBtnIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String defaultBikeImg;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String filterIconImg;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String filterIconImgAltText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modifyBtnIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String loadMoreLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String serverErrorMsgDescription;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String dataNotFoundErrorMsgDescription;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String noResultFoundIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String noResultFoundDescription;

    @ChildResource
    private List<LocationsModel> locations;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String priceInputLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String ageInputLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalTimeLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String kmRangeInputLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideRidersCount;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modifyBtnStyle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String filterBtnStyle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String googleMapIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lateReturnNote;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeValidationFirstMessage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeValidationSecondMessage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeValidationThirdMessage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeValidationForthMessage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeValidationFifthMessage;

    private String travelPermit = StringUtils.EMPTY;

    @SlingObject
    private Resource currentResource;

    @OSGiService
    private SearchResult searchResultButton;

    @ScriptVariable
    private ResourceResolver resolver;

    @Override
    public List<SearchResultEntity> getSearchResultList() {
       return null;
    }


    @PostConstruct
    protected void init() {
        Map<String, Object> permitMap = CommonUtils
                .getStatePermissionMap(CommonUtils
                .getAEMPathConfig(currentResource)
                .travelPermitExpPath(), resolver);

        try {
            travelPermit = new ObjectMapper()
                    .writeValueAsString(permitMap);
        } catch (JsonProcessingException e) {
            LOGGER.error("RepositoryException :: {0}",
                    e.getMessage());
        }
    }

}
