package com.re.wanderlust.core.models.impl;


import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.DownloadPdfModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {DownloadPdfModel.class},
        resourceType = {DownloadPdfModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class DownloadPdfModelImpl extends BaseComponentModel
        implements DownloadPdfModel {
    static final String RESOURCE_TYPE
            = "re-wanderlust/components/downloadButtonComp";
    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String path;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String btnLabel;
}
