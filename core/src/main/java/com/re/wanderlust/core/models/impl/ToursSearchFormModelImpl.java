package com.re.wanderlust.core.models.impl;
import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.constants.CommonConstants;
import com.re.wanderlust.core.models.ToursSearchFormModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.models.internals.CommonEntityTours;

import com.re.wanderlust.core.models.internals.TourSearchFormApi;
import com.re.wanderlust.core.models.internals.WhereLocationEntityTours;
import com.re.wanderlust.core.services.TourSearchFormService;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {ToursSearchFormModel.class},
        resourceType = {ToursSearchFormModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ToursSearchFormModelImpl extends BaseComponentModel
        implements ToursSearchFormModel {

    static final String RESOURCE_TYPE =
            "re-wanderlust/components/tourSearchForm";
    private static final Logger LOGGER
            = LoggerFactory.getLogger(ToursSearchFormModelImpl.class);

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String path;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectMedia;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String thumbnailDesktop;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String thumbnailMobile;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String reLogoImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String selectMontYearPopup;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String montAndYearLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileVideo;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String desktopVideo;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mute;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String autoplay;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String altText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileGif;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String desktopGif;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileImage;


    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String desktopImage;

    public String getExploreButton() {
        return request.getResourceResolver()
                .map(exploreButton + CommonConstants.HTML_EXT);
    }

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String exploreButton;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String exploreButtonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String continueLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String fetchFromApi;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String type;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String whereLocValidation;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startLocValidation;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String variation;

    @SlingObject
    private Resource currentResource;
    private String mapping = StringUtils.EMPTY;

    private  String status = StringUtils.EMPTY;

    @OSGiService
    private TourSearchFormService tourSearchFormService;

    @ScriptVariable
    private SlingHttpServletRequest request;
    private List<WhereLocationEntityTours>
        whereallLocations = new ArrayList<>();

    private List<TourSearchFormApi>
            whereallLocation = new ArrayList<>();

    @ChildResource
    private Resource startLocations;
   private Map<String, CommonEntityTours>
           map = new HashMap();

    @PostConstruct
    protected void init() {
        if (fetchFromApi.equals("true")) {
            String api = CommonUtils.getAPIConfig(currentResource)
                    .apiBaseUrl()
                    + CommonUtils.getAPIConfig(currentResource)
                    .tourSearchFormApiUrl();
            if (api == null) {
                LOGGER.debug("Api is not present", api);
            }
            map = tourSearchFormService.getTourSearchFormPage(api);
            status = tourSearchFormService.getStatusCode();
            whereallLocation = tourSearchFormService.getWhereList(api);
        } else {
            status = "200";
            if (startLocations != null && startLocations.hasChildren()) {

                for (Resource parentRes : startLocations.getChildren()) {
                    ValueMap prop = parentRes.getValueMap();
                    String startLoc = StringUtils.EMPTY;
                    String lat = StringUtils.EMPTY;
                    String lon = StringUtils.EMPTY;
                    if (prop.containsKey("startLocationName")) {
                        startLoc = prop.get("startLocationName", String.class);
                    }
                    if (prop.containsKey("startLocationLat")) {
                        lat = prop.get("startLocationLat", String.class);
                    }
                    if (prop.containsKey("startLocationLong")) {
                        lon = prop.get("startLocationLong", String.class);
                    }

                    Resource whereLocations =
                            parentRes.getChild("whereLocations");
                    if (whereLocations == null) {
                        LOGGER.debug("Where location is not"
                                + " present", whereLocations);
                    }
                    List<WhereLocationEntityTours> whereLocationEntityToursList
                            = new ArrayList<>();
                    if (whereLocations.hasChildren()) {

                        for (Resource subChildResource
                                : whereLocations.getChildren()) {
                            LOGGER.debug("subChildResource path: "
                                    + "{}", subChildResource.getName());
                            WhereLocationEntityTours whereLocationEntityTours
                                    = new WhereLocationEntityTours();
                            whereLocationEntityTours = subChildResource
                                    .adaptTo(WhereLocationEntityTours.class);
                            whereallLocations
                                    .add(whereLocationEntityTours);
                            whereLocationEntityToursList
                                    .add(whereLocationEntityTours);
                        }

                    }
                    CommonEntityTours commonEntity = new CommonEntityTours();
                    commonEntity.setWhereLocation(whereLocationEntityToursList);
                    commonEntity.setStartLocationLong(lon);
                    commonEntity.setStartLocationLat(lat);
                    map.put(startLoc, commonEntity);
                }
            }
        }
        System.out.println(whereallLocations);
        try {
            mapping =  new ObjectMapper()
                     .writeValueAsString(map);
        } catch (JsonProcessingException e) {
            LOGGER.error("RepositoryException :: {0}", e.getMessage());
        }
    }

}

