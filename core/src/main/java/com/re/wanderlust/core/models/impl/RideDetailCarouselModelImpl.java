package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.day.cq.wcm.api.Page;
import com.google.gson.Gson;
import com.re.wanderlust.core.models.RideDetailCarouselModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.models.internals.RideDetailCarouselEntity;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 *  Represents a Ride Detail Carousel Model Impl.
 *  used for <b>re-wanderlust</b> project implementation
 *
 *  @version 1.0
 *  @since 1.0
 */
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {RideDetailCarouselModel.class},
        resourceType = {RideDetailCarouselModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class RideDetailCarouselModelImpl extends BaseComponentModel
        implements RideDetailCarouselModel {

    static final String RESOURCE_TYPE =
            "re-wanderlust/components/rideDetailCarousel";
    public static final String START_LOCATION = "startLocation";
    public static final String END_LOCATION = "endLocation";
    public static final String TOTAL_DISTANCE = "totalDistance";

    private List<RideDetailCarouselEntity> entityList = new ArrayList<>();

    static final Logger LOGGER =
            LoggerFactory.getLogger(RideDetailCarouselModelImpl.class);

//-------------------  Basic Tab  -------------------------------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String type;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String enableMute;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String enableAutoplay;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String startPoint;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String endPoint;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String terrainLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String terrain;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalDistance;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String daysCount;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String iconOne;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String locationIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String iconSecond;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String iconThird;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String iconFourth;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String altTextForIcon;

    //------------------- Basic Tab Tour DropDown -------------------------->
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String categoryType;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourLocation;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String reviewCount;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String totalRating;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorId;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorLoc;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatedLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String operatorName;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String starIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tourLocationIcon;


//--------------------------------------------------------------->

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String detailPageSelection;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideStartLocation;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideEndLocation;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideTerrain;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideTotalDistance;

    @ChildResource
    private Resource fieldItems;

    @Inject
    private Page currentPage;

    @ScriptVariable
    private SlingHttpServletRequest request;

    private String isCallFromPublisher = "false";

    private String pageTitle;
    private String totalDistanceValue;
    private String startLocation;
    private String endLocation;

    @PostConstruct
    protected void init() {
        if (fieldItems != null && fieldItems.hasChildren()) {
            for (Resource childRes : fieldItems.getChildren()) {
                RideDetailCarouselEntity rideDetailCarouselEntity =
                        childRes.adaptTo(RideDetailCarouselEntity.class);
                entityList.add(rideDetailCarouselEntity);
            }
            LOGGER.debug("GET entityList :: {}", entityList);
        }
        pageTitle = currentPage.getTitle();
        ValueMap pageProps = currentPage.getProperties();
        LOGGER.debug("GET valueMap page properties in "
                + "ride detail carousel :: {}", pageProps);
        startLocation = pageProps.get(START_LOCATION, String.class);
        totalDistanceValue = pageProps.get(TOTAL_DISTANCE, String.class);
        endLocation = pageProps.get(END_LOCATION, String.class);

        if (CommonUtils.isPublishMode(request)) {
            isCallFromPublisher = "true";
        }

        getValue();
    }

    /**
     *
     * @return {String}
     */
    public String getValue() {
        if (StringUtils.isEmpty(title)) {
            title = pageTitle;
        }
        return title;
    }

    public List<RideDetailCarouselEntity> getEntityList() {
        return entityList;
    }

    /**
     * @return the first index carousel image's
     */
    public String getImage() {
        RideDetailCarouselEntity rideDetailCarouselEntity = entityList.get(0);
        if (rideDetailCarouselEntity
                .getVariation().
                equalsIgnoreCase("video")) {
            rideDetailCarouselEntity
                    .setDesktopImage(rideDetailCarouselEntity
                            .getVideoThumbnail());
            rideDetailCarouselEntity
                    .setMobileImage(rideDetailCarouselEntity
                            .getVideoMobileThumbnail());
        }
        return new Gson().toJson(rideDetailCarouselEntity);
    }
}
