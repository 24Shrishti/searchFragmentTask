package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.re.wanderlust.core.models.TourSearchFormResultModel;

import lombok.Data;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import org.apache.sling.api.resource.Resource;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import java.util.ArrayList;
import java.util.List;
import com.re.wanderlust.core.models.internals.SortEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {TourSearchFormResultModel.class},
        resourceType = {TourSearchFormResultModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class TourSearchFormResultModelImpl implements
                TourSearchFormResultModel {
static final String RESOURCE_TYPE = "re-wanderlust/components/"
+ "tourSearchFormResult";
        private static final Logger LOGGER
                = LoggerFactory.getLogger(TourSearchFormResultModelImpl.class);

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String filterLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String tourDurationLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String resetAllLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String startPointLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String destinationLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String languageSpokenLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String tourRatingsLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String partnersLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String noResultFoundLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String pleaseChangeFiltersAndTryAgainLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String toursForYouLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String sortByLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String startingPointLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String whereLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String monthandYearLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String altText;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String applyLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String searchLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String ratingLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String daysLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String startingFromLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String operatedByLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String addToCompareLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String addedToCompareLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String bookNowBtnLabel;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String startPointMsg;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String wherePoint;

        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String dateAndTime;

        @Default(values = StringUtils.EMPTY)
        private String sortOption;

        @ChildResource
        private Resource sortOptions;
        private List<SortEntity> list = new ArrayList<>();

        private String mapAttribute = StringUtils.EMPTY;

        @PostConstruct
        protected void init() {
                if (sortOptions != null && sortOptions.hasChildren()) {
                        for (Resource resource : sortOptions.getChildren()) {
                                LOGGER.debug("resource path: {}",
                                        resource.getName());
                                SortEntity sortEntity = resource.adaptTo(
                                                SortEntity.class);
                                list.add(sortEntity);
                        }
                }
                Map<String, Object> mapObj = new HashMap<>();
                mapObj.put("startingFromLabel", startingFromLabel);
                mapObj.put("operatedByLabel", operatedByLabel);
                mapObj.put("addToCompareLabel", addToCompareLabel);
                mapObj.put("addedToCompareLabel", addedToCompareLabel);
                mapObj.put("bookNowBtnLabel", bookNowBtnLabel);
                mapObj.put("toursForYouLabel", toursForYouLabel);
                mapObj.put("sortByLabel", sortByLabel);
                mapObj.put("sortByOptions", list);
                        try {
                                mapAttribute = new ObjectMapper()
                                .writeValueAsString(mapObj);
                        } catch (JsonProcessingException e) {
                                // TODO Auto-generated catch block
                                LOGGER.error("JsonProcessingException "
                                        + "occurred: {}", e.getMessage());
                                e.printStackTrace();
                        }
                sortOption = new Gson().toJson(list);
        }


}
