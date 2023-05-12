package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.CancellationPolicyModel;
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
        adapters = {CancellationPolicyModel.class},
        resourceType = {CancellationPolicyModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CancellationPolicyModelImpl extends BaseComponentModel
        implements CancellationPolicyModel {

    protected static final String RESOURCE_TYPE = "re-wanderlust"
                                + "/components/cancellationPolicy";

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationPolicyTitleLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationPolicyDescription;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String timeFrameHeaderLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationAmountHeaderLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String betweenLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String daysLessThanFirstWarningLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String daysLessThanSecondWarningLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String daysLessThanThirdWarningLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancellationAmountLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lateReturnLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lateReturnFirstWarningLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lateReturnSecondWarningLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String lateReturnThirdWarningLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String currencyType;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cancelButtonLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String amountPercentageSymbol;
}
