package com.re.wanderlust.core.models.internals;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Getter
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SelfGuidedEntity {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String desktopImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String mobileImage;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tripTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String altText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String tags;
}
