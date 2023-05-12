package com.re.wanderlust.core.models.internals;

import lombok.Data;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Data
@Model(
        adaptables = {Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SocialLinkEntity {

    @ValueMapValue
    private String buttonIcon;

    @ValueMapValue
    private String buttonLink;
}
