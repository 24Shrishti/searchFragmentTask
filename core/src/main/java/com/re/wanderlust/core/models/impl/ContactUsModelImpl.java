package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.ContactUsModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Getter
@Model(adaptables = {SlingHttpServletRequest.class},
        adapters = {ContactUsModel.class},
        resourceType = {ContactUsModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ContactUsModelImpl extends BaseComponentModel
        implements ContactUsModel {

    protected static final String RESOURCE_TYPE = "re-wanderlust/"
            + "components/contactUs";

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String contactLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String phoneNumber;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String contactUsIcon;
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mailLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String email;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mailUsIcon;

    @Default(values = StringUtils.EMPTY)
    private String downloadLink;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String downloadIcon;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String downloadLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String reachUs;

}
