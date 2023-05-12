package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.day.cq.wcm.api.Page;
import com.re.wanderlust.core.beans.TourEntity;
import com.re.wanderlust.core.constants.CommonConstants;
import com.re.wanderlust.core.models.TourItineraryModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.models.internals.ItineraryMultiFieldEntity;
import com.re.wanderlust.core.services.TourItineraryService;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {TourItineraryModel.class},
        resourceType = {TourItineraryModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class TourItineraryModelImpl extends BaseComponentModel implements
        TourItineraryModel {

    static final String RESOURCE_TYPE
            = "re-wanderlust/components/tourItinerary";
    private static final Logger LOGGER
            = LoggerFactory.getLogger(TourItineraryModelImpl.class);
    public static final String STRING = "/";
    public static final int THREE = 3;
    public static final String JCR_CONTENT = "jcr:content";
    public static final String JCR_TITLE = "jcr:title";

    /************** for basic tab. *************/

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String endLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String avgSaddleLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String temperatureLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String distanceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String terrainLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String overviewLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String highlightsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String distanceKmLabel;

    /************** for icons tab. *************/

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String endIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String avgSaddleIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String temperatureIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String distanceIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mapIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String terrainIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String downloadIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String nearestRailwayIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String nearestAirportIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String alertIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String crossIcon;

    /************** for itinerary tab. *************/

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String itineraryLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String dayLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startEarlyLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mapLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String downloadItineraryLabel;

    /************** for keep in mind tab. *************/

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String keepInMindLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String requirementLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String whatToBringLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String howToReachLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String documentRequiredLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String inclusionLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String exclusionLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String nearestRailwayLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String nearestAirportLabel;

    /************** for tour guide tab. *************/

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourGuideLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String languageSpokenLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String experienceLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String yearsLabel;

    /************** for book this tour tab. *************/

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookTourLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String datesLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String priceChange;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingAlertLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String discardBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String continueBtn;

    public String getBookingFormPath() {
        return request.getResourceResolver()
                .map(bookingFormPath + CommonConstants.HTML_EXT);
    }

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingFormPath;

    public String getInquiryPagePath() {
        return request.getResourceResolver()
                .map(inquiryPagePath + CommonConstants.HTML_EXT);
    }

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String inquiryButtonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String inquiryPagePath;

    public String getTourItineraryPath() {
        return request.getResourceResolver()
                .map(tourItineraryPath + CommonConstants.HTML_EXT);
    }

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourItineraryPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String apiErrorMessage;

    /**************** end. **************/

    @ValueMapValue(name = JCR_TITLE)
    private String titleText;

    @Inject
    private Page currentPage;

    private String pagePath;

    @OSGiService
    private TourItineraryService
            tourItineraryService;

    @SlingObject
    private Resource currentResource;

    @ScriptVariable
    private SlingHttpServletRequest request;

    @ChildResource
    private Resource fieldItems;

    private TourEntity tourItineraryEntity =
            new TourEntity();

    private String suffixFirst;

    private String suffixSecond;

    private String preSuffixName = StringUtils.EMPTY;;
    private Resource parentRes;
    private Resource childRes;

    public List<ItineraryMultiFieldEntity> getFieldEntityList() {
        return fieldEntityList;
    }

    private List<ItineraryMultiFieldEntity> fieldEntityList =
            new ArrayList<>();

    @PostConstruct
    protected void init() {
        preSuffixName = CommonUtils.getCookieConfig(
                currentResource).preSuffixName();
        if (fieldItems != null && fieldItems.hasChildren()) {
            for (Resource resource : fieldItems.getChildren()) {
                LOGGER.debug("resource path: {}", resource.getName());
                ItineraryMultiFieldEntity itineraryMultiFieldEntity =
                                   resource.adaptTo(
                                   ItineraryMultiFieldEntity.class);
                fieldEntityList.add(itineraryMultiFieldEntity);
            }
        }
        LOGGER.debug("Getting Field entity"
                + " list :{}", fieldEntityList);
    }


    /**
     *
     * @return {@link TourEntity}
     */
    public TourEntity getList() {
        List<String> listOfSuffix = CommonUtils.getSuffixFromUrl(request);
         suffixFirst = listOfSuffix.get(2);
         LOGGER.debug("The first suffix is: {}", suffixFirst);
         suffixSecond = listOfSuffix.get(THREE);
        LOGGER.debug("The second suffix is : {}", suffixSecond);
         LOGGER.debug("The preSuffixName is : {}", preSuffixName);

        if (StringUtils.isNotBlank(suffixFirst)
                && StringUtils.isNotBlank(suffixSecond)
                && StringUtils.isNotBlank(preSuffixName)) {

            String apiBaseUrl = CommonUtils.getAPIConfig(currentResource).
                    apiBaseUrl();
            if (apiBaseUrl == null) {
                LOGGER.debug("no url present", apiBaseUrl);
            }

            String url = apiBaseUrl + CommonUtils.getAPIConfig(currentResource).
                    tourItineraryApiUrl();
            if (url == null) {
                LOGGER.debug("no url present", url);
            }
            tourItineraryEntity = tourItineraryService.
                    getItineraryList(
                            url + STRING + suffixFirst + STRING + suffixSecond);
            titleText = tourItineraryEntity.getTripName();
            if (StringUtils.isNotEmpty(titleText)) {
                getTitleText(titleText);
            }
        } else {
            LOGGER.debug("Getting empty Tour "
                    + "entity list: {}", tourItineraryEntity);
            return tourItineraryEntity;
        }
        LOGGER.debug("Final Tour List"
                + "Itinerary entity list: {} ", tourItineraryEntity);
        return  tourItineraryEntity;

    }

    private void getTitleText(final String titleText) {
        pagePath = currentPage.getPath();
        ResourceResolver resourceResolver = request.getResourceResolver();
        LOGGER.debug("Tour Name is  :: {}", titleText);
        if (resourceResolver != null) {
           parentRes = resourceResolver.getResource(pagePath);
           if (parentRes != null && parentRes.hasChildren()) {
               childRes = parentRes.getChild(JCR_CONTENT);
               ModifiableValueMap modifiableValueMap =
                       childRes.adaptTo(ModifiableValueMap.class);
               modifiableValueMap.put(JCR_TITLE, titleText);
           } else {
               LOGGER.debug("Resource Resolver is  null :: {}",
                       resourceResolver);
           }
        }
        try {
            parentRes.getResourceResolver().commit();
        } catch (PersistenceException e) {
            LOGGER.error("PersistenceException"
                    + ":: TourItineraryModelImpl()"
                    + ":: getTitleText{0}", e);
        }

    }


}
