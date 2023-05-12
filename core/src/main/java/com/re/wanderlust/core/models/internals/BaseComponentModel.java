package com.re.wanderlust.core.models.internals;

import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Data
@Model(adaptables = SlingHttpServletRequest.class)
public class BaseComponentModel extends ErrorFieldsModel {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String imagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String openInNewTab;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String anchorPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String imgAltText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideComponent;


}
