package com.re.wanderlust.core.models.internals;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Data
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LanguageAttribute {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String languageCode;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String languageName;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String redirectionPath;

}
