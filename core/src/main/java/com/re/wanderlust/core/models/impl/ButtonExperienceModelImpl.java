package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.ButtonExperienceModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
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
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 *  Represents a Button Experience Model Impl.
 *  used for <b>re-wanderlust</b> project implementation
 *
 *  @version 1.0
 *  @since 1.0
 */
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {ButtonExperienceModel.class},
        resourceType = {ButtonExperienceModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ButtonExperienceModelImpl extends BaseComponentModel
        implements ButtonExperienceModel {

    static final String RESOURCE_TYPE =
            "re-wanderlust/components/buttonExperienceComp";

    private static final Logger LOGGER = LoggerFactory
            .getLogger(ButtonExperienceModelImpl.class);

    @ChildResource
    private Resource details;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String button;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String iframeValue;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String skillBoxTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String titleLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancelButton;

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
    private String buttonId;


    private Map<String, String> detailsMap = new HashMap<>();

    @PostConstruct
    protected void init() {

        if (details != null && details.hasChildren()) {
            for (Resource childResource : details.getChildren()) {
                ValueMap vm = childResource.getValueMap();
                if (vm.containsKey("detailTitle")) {
                    detailsMap.put(vm.get("detailTitle", String.class),
                            vm.get("detailDescription", String.class));
                }
            }
            LOGGER.debug("Return detailsMap in button "
                    + "experience  :: {}", detailsMap);
        }
    }

}
