package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.beans.request.OperatorListingEntityList;
import com.re.wanderlust.core.constants.CommonConstants;
import com.re.wanderlust.core.models.OperatorListingModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.services.OperatorListingService;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;


@Setter
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {OperatorListingModel.class},
        resourceType = {OperatorListingModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class OperatorListingModelImpl extends BaseComponentModel
        implements OperatorListingModel {
    static final String RESOURCE_TYPE
            = "re-wanderlust/components/operatorListing";
    public static final String RENTAL = "rental";
    public static final String TOUR = "tour";
    public static final String LAT = "lat";
    public static final String LONG = "long";

    private static final Logger
            LOGGER = LoggerFactory.getLogger(
            OperatorListingModelImpl.class);

    private OperatorListingEntityList operatorListingEntityList;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String itemsNumber;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String filledStarIconPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String filledStarIconUnGlowPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String fleetLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String modelLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String locationLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String buttonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalReview;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String path;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String altText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lat;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String newTab;

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
    private String operatorType;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourPartnersTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorAvailable;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideTotalOperator;

    @OSGiService
    private OperatorListingService operatorListingService;

    @Getter
    private String preSuffixName = StringUtils.EMPTY;

    @SlingObject
    private Resource currentResource;

    @ScriptVariable
    private SlingHttpServletRequest request;

    @ScriptVariable
    private ResourceResolver resolver;

    public String getPath() {
        return resolver.map(path + CommonConstants.HTML_EXT);
    }
    @PostConstruct
    protected void init() {
        preSuffixName = CommonUtils.
                getCookieConfig(currentResource).preSuffixName();
      lat = request.getParameter(LAT);
      lon = request.getParameter(LONG);
        LOGGER.debug("GET preSuffixName from caConfig :: {}",
                preSuffixName);
      lat = request.getParameter("lat");
      lon = request.getParameter("long");
    }

    /**
     *
     * @return {@link OperatorListingEntityList}
     */
    public OperatorListingEntityList getList() {
        if (StringUtils.equals(operatorType, RENTAL)
                && StringUtils.isNotEmpty(lat)
                && StringUtils.isNotEmpty(lon)
                && StringUtils.isNotEmpty(itemsNumber)) {
            operatorListingEntityList  = operatorListingService.operatorListing(
                    CommonUtils.getAPIConfig(currentResource).apiBaseUrl()
                            + CommonUtils.getAPIConfig(currentResource).
                            operatorListingAPIUrl(),
                    itemsNumber, lat, lon, operatorType
            );
        }
        if (StringUtils.equals(operatorType, TOUR)
                && StringUtils.isNotEmpty(lat)
                && StringUtils.isNotEmpty(lon)
                && StringUtils.isNotEmpty(itemsNumber)) {
            operatorListingEntityList = operatorListingService.operatorListing(
                    CommonUtils.getAPIConfig(currentResource).apiBaseUrl()
                            + CommonUtils.getAPIConfig(currentResource).
                            operatorListingAPIUrl(),
                    itemsNumber, lat, lon, operatorType
            );
        } else {
            LOGGER.debug("Return operatorListingEntityList :: {}",
                    operatorListingEntityList);
            return operatorListingEntityList;
        }
        LOGGER.debug("Return operatorListingEntityList if "
                + "lat & long are empty :: {}", operatorListingEntityList);
        return operatorListingEntityList;
    }

}
