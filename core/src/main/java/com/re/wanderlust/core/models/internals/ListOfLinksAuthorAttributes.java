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
public class ListOfLinksAuthorAttributes {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String text;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String url;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String anchorTitle;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String openInNewWindow;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String imagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String imageAltText;
}
