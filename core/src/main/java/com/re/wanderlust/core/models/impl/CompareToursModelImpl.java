package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.beans.CompareToursPageEntity;
import com.re.wanderlust.core.constants.CommonConstants;
import com.re.wanderlust.core.models.CompareToursModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import com.re.wanderlust.core.models.internals.CompareToursEntity;
import com.re.wanderlust.core.services.CompareToursService;
import com.re.wanderlust.core.utils.CommonUtils;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Data
@Model(adaptables = {SlingHttpServletRequest.class},
        adapters = {CompareToursModel.class},
        resourceType = {CompareToursModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)

public class CompareToursModelImpl extends BaseComponentModel
        implements CompareToursModel {

    protected static final String RESOURCE_TYPE =
            "re-wanderlust/components/compareTours";

    private static final Logger LOGGER
            = LoggerFactory.getLogger(CompareToursModelImpl.class);

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String starIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String reviewsLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String btnLabel;
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String reviews;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String veiwDetailBtn;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String arrowIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String goBackBtnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String goBackIcon;

    public String getSearchPath() {
        return request.getResourceResolver()
                .map(searchPath + CommonConstants.HTML_EXT);
    }

        @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String searchPath;

    @ScriptVariable
    private Page currentPage;

    @ScriptVariable
    private SlingHttpServletRequest request;

    @ScriptVariable
    private ResourceResolver resolver;

    public static final String KEY_DATA = "key";
    @ChildResource
    private Resource keyValue;

    @Self
    private Resource resource;

    @OSGiService
    private CompareToursService compareToursService;

    private String pageKey;

    private List<CompareToursEntity> labelsList = new ArrayList<>();
    private List<CompareToursPageEntity> newKeyList = new ArrayList<>();



    @PostConstruct
    protected void init() {
        String[] suffix = CommonUtils
                .getSuffixFromUrl(request).toArray(new String[0]);
        LOGGER.debug("GET suffix from url :: {}", suffix);
        if (suffix.length > 1) {
            newKeyList = compareToursService
                    .getSearchEntity(suffix, searchPath, resolver, keyValue);
            LOGGER.debug("Getting List of CompareToursPageEntity "
                    + "with tour's info: {}", newKeyList);
        }

        if (keyValue != null && keyValue.hasChildren()) {
            for (Resource child : keyValue.getChildren()) {
                CompareToursEntity compareToursLabels
                        = child.adaptTo(CompareToursEntity.class);
                labelsList.add(compareToursLabels);
            }
        }
        LOGGER.debug("Getting List from: {}", labelsList);
    }
}

