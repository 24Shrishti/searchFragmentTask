package com.re.wanderlust.core.models.impl;

import com.adobe.cq.export.json.ExporterConstants;
import com.re.wanderlust.core.models.ConfirmedAlternateBookingModel;
import com.re.wanderlust.core.models.internals.BaseComponentModel;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 *  The class {@code ConfirmedAlternateBookingModelImpl} that contains object.
 *  required for the model
 *
 *  @version 1.0
 *  @since 1.0
 */
@Getter
@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {ConfirmedAlternateBookingModel.class},
        resourceType = {ConfirmedAlternateBookingModelImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ConfirmedAlternateBookingModelImpl extends BaseComponentModel
        implements ConfirmedAlternateBookingModel {

    static final String RESOURCE_TYPE =
            "re-wanderlust/components/confirmedAlternateBooking";

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String select;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingIdLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String bookingMadeWithLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String unavailableLabel;

    @ValueMapValue
    @Default(values = org.apache.commons.lang3.StringUtils.EMPTY)
    private String badRequest;

    @ValueMapValue
    @Default(values = org.apache.commons.lang3.StringUtils.EMPTY)
    private String notFound;

    @ValueMapValue
    @Default(values = org.apache.commons.lang3.StringUtils.EMPTY)
    private String serverError;

}
