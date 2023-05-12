package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.TeaserListModel;
import com.re.wanderlust.core.models.internals.TeaserListEntity;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {TeaserListModel.class},
        resourceType = {TeaserListModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class TeaserListModelImpl implements TeaserListModel {

    static final String RESOURCE_TYPE = "re-wanderlust/components"
            + "/teaserList";

    private static final Logger LOGGER
            = LoggerFactory.getLogger(TeaserListModelImpl.class);

    public static final String REASON_TITLE = "title";
    private static final String ICON = "icon";
    private static final String LATITUDE = "latitude";
    private static final String LONGITUDE = "longitude";
    private static final String UNSELECTED_ICON = "unselectedIconPath";

    @ChildResource
    private Resource fieldItems;

    private Map<String, TeaserListEntity> reasonMap = new HashMap<>();


    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @Getter
    private String preSuffixName = StringUtils.EMPTY;

    @PostConstruct
    protected void init() {
        if (fieldItems != null && fieldItems.hasChildren()) {
            for (Resource childRes:fieldItems.getChildren()) {
                ValueMap valueMap = childRes.getValueMap();
                if (valueMap.containsKey(REASON_TITLE)) {
                    String title = valueMap.get(REASON_TITLE, String.class);
                    String image = valueMap.get(ICON, String.class);
                    String unselectedImage = valueMap.get(UNSELECTED_ICON,
                            String.class);
                    String latitude = valueMap.get(LATITUDE, String.class);
                    String longitude = valueMap.get(LONGITUDE, String.class);
                    TeaserListEntity teaserListEntity = new TeaserListEntity();
                    teaserListEntity.setIcon(image);
                    teaserListEntity.setUnselectedIcon(unselectedImage);
                    teaserListEntity.setLatitude(latitude);
                    teaserListEntity.setLongitude(longitude);
                    reasonMap.put(title, teaserListEntity);
                }
            }
            LOGGER.debug("Getting the Map<title,"
                    + "teaserListEntity>: {} ", reasonMap);
        }
    }

}

