package com.re.wanderlust.core.models.internals;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.re.wanderlust.core.beans.ExtraLinkEntity;
import lombok.Getter;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.json.JSONException;
import org.json.JSONObject;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Getter
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterAttribute {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String copyrightText;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String textIsRich;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String sectionId;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String includeSubscribe;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String includeSocialLinks;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideOnMobile;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String hideOnTablet;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String footerLinksGridColumns;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String disableComponent;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String customHeight;

    @ValueMapValue
    @Default(values = {})
    private String[] extraLinks;

    private List<ExtraLinkEntity> extraLinkEntityList = new ArrayList<>();
    @PostConstruct
    protected void init() throws JsonProcessingException, JSONException {
        if (ArrayUtils.isNotEmpty(extraLinks)) {
            for (String extraLink : extraLinks) {
                ExtraLinkEntity extraLinkEntity = new ExtraLinkEntity();
                JSONObject responseObj = new JSONObject(extraLink);
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    extraLinkEntity = objectMapper.readValue(String.
                                    valueOf(responseObj),
                                    new TypeReference<ExtraLinkEntity>() { });
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                extraLinkEntityList.add(extraLinkEntity);
            }
        }
    }
}
